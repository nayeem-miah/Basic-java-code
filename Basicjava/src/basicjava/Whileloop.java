package basicjava;

import java.util.Scanner;


public class Whileloop {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=10){
            System.out.println("enter your number");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(" ihis number"+n); 
            sum=sum+n;
            i=i+1;
         
        }
        {
      
        System.out.println("sum is "+sum);
        }
        if (sum%2==0){
            System.out.println("number is even");
         
        }
        else{
            System.out.println("number is odd");
        }
    }
}   

