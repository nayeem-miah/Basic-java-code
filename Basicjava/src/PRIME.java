
import java.util.Scanner;


public class PRIME {
    public static void main(String[] args) {
        int i,num,count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number=");
        num = input.nextInt();
        for ( i =2;i < num; i++) {
            if(num%i==0){
                
                count++;
                break;
                
            }
       
        if(count==0){
            System.out.println("prime number");
        }
        else{       
            System.out.println("not prime number");
        }
        
       
                
    }
    
}
