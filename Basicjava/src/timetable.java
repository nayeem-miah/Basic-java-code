
import java.util.Scanner;


public class timetable {
    public static void main(String[] args) {
        int n,m,i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number :");
        m=input.nextInt();
        System.out.print("enter finall number :");
        n=input.nextInt();
        for ( i = m; i <= n; i++) {
            for ( j = 1; j <= 10; j++) {
               
                System.out.println(i+"X"+j+"="+i*j);
                
            }
            System.out.println("\n\n");
            
        }
            
        
        
    }
    
}
