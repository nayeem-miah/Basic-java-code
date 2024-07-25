// 1*2*3*...*n
import java.util.Scanner;


public class forloop2 {


    public static void main(String[] args) {
      
        int i,n,sum=1;        
        Scanner input=new Scanner(System.in);
        System.out.print("enter the last number: ");
        n=input.nextInt();        
        for ( i = 1; i <= n; i=i+1) {
            System.out.print(i+" ");
            sum=sum * i;
            
        }
        System.out.println("\nsum is :"+sum);
    }
    
}

    
}
