
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number=");
        int num = input.nextInt();
        int first=0;
        int sceond=1;
        int fibo;
        System.out.print(first+" "+sceond);
        for (int i = 3; i < num; i++) {
            fibo=first+sceond;
            System.out.print(" "+fibo);
            first=sceond;
            sceond=fibo;
            
        }
    }
    
}
