
import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
    
        int i,num,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.print("enter any poditive number=");
        num=input.nextInt();
        for (i= num; i>=1; i--) {
           fact=fact*i; 
      
        }
        System.out.println("factrial of "+num+"= "+fact);
    }
    
}
