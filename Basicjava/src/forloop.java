
import static java.lang.Double.sum;
import java.util.Scanner;


public class forloop {
    public static void main(String[] args) {
        int i,m,n,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first number:");
        m=input.nextInt();
        System.out.print("enter the last number:");
        n=input.nextInt();
                            
        for ( i = m; i < n; i++) {
            if(i%2==0)
                System.out.println(" "+i);
            sum=sum+i;
            
            
        }
        System.out.println("sum is  "+sum);
    }
    
}
