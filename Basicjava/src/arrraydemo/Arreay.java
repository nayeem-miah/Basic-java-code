package arrraydemo;

import java.util.Scanner;

public class Arreay {
    public static void main(String[] args){      
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any positive number");
        int [] num =new int[5];
        for (int i = 0; i < 5; i++) {
            num[i]=input.nextInt();
            
     
        }
        for (int i = 0; i < 5; i++) {
            sum=sum+num[i];
            
        }
        System.out.println("sum is sum"+sum);    
        
    }
            
}
