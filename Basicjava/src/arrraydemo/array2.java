
package arrraydemo;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        double sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any  number");
        double [] number=new double[5];
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
            
        }
        System.out.println("this sum is ="+sum);
        double avg;
        avg=sum/number.length;
        System.out.println(" avarage is ="+avg);
        double max=number[0];
        for (int i = 1; i < 5; i++) {
            if (max<number[i]){
                max=number[i];
            }
     
            System.out.println("maxmum number is="+max);
        }
    }
   
            
    
}
