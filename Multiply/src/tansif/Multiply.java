package tansif;

import java.util.Scanner;

public final class Multiply{
   Scanner in = new Scanner(System.in);
    private Multiply() {
        System.out.println("ENTER TOW BIG NUMBERS TO MULTIPLY");
     multiply(in.nextLine(),in.nextLine());
    }
   
    public void multiply(String f,String s){
        int[] result= new int[f.length() + s.length()];
        int count,temp;
        for(int i=s.length()-1;i>=0;i--){
            count=result.length-1-(s.length()-1-i);
            temp=0;
            for(int j=f.length()-1;j>=0;j--){
                temp+=(s.charAt(i)-48)*(f.charAt(j)-48);
                result[count--]+=temp%10;
                temp/=10;
            }
            result[count]=temp;
        }
        temp=0;
        for(int p=result.length-1;p>=0;p--){
            temp+=result[p];
            result[p]=temp%10;
            temp/=10;
        }
         for(int p=0;p<result.length;p++){
           if(result[0]==0){
               result[0]=-1;
               continue;
           } 
            System.out.print(result[p]);
         }
    }
  public static void main(String[] args){
     new Multiply();
    
    }
}