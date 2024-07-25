import java.util.Scanner;
public class primeNUMBER {
    public static void main(String[] args) {
        int m,n,i,j,count=0,totalprime=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number m=");
        m = input.nextInt();
        System.out.print("Enter finall number n=");
        n=input.nextInt();
        for (i = m; i <=n; i++) {
            for (j = 2; j <=i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                
                System.out.println(i);
                totalprime++;
            }
            count=0;
             
            
        }
        System.out.println("total prime="+totalprime);                                       
    }               
}
