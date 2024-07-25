// 1+2+3+4+... ... ...+n=i=i+1;
//1+3+5+... ... ... +n=i=i=2;
//1.5+2.5+3.5+... ... ...n
import java.util.Scanner;


public class forloop1 {
    public static void main(String[] args) {
      
        double i,n,sum=0;        
        Scanner input=new Scanner(System.in);
        System.out.print("enter the last number: ");
        n=input.nextDouble();
     
        
        
        for ( i = 1.5; i < n; i=i+1) {
            System.out.print(","+i);
            sum=sum+i;
            
        }
        System.out.println("\nsum is :"+sum);
    }
    
}
