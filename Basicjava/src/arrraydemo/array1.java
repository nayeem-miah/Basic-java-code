package arrraydemo;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        double sum=0;
        Scanner input = new Scanner(System.in);      
        System.out.println("enter the 5 number =");
        double []number=new double[5];
        for (int i = 0; i < 5; i++) {
            number[i]=input.nextDouble();                
        }
        //number[0]=1;
        //number[1]=2;
        //number[2]=3;
        //number[3]=4;
        //number[4]=5;
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
            
        }
        double ave=sum/number.length;
        System.out.println("sum is ="+sum);
        System.out.println("avarage is ="+ave);
    }
    
    
}
