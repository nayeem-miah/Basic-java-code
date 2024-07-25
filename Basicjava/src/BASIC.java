
import java.util.Scanner;


public class BASIC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter nnumber a=");
        double a=input.nextDouble();
        System.out.print("enter nnumber b=");
        double b=input.nextDouble();
        System.out.print("enter nnumber c=");
        double c=input.nextDouble();
        double d=((b*b)-(4*a*c));
        if(d>0){
            double r1=((-b+Math.sqrt(d))/2*a);
            double r2=((-b-Math.sqrt(d))/2*a);
            System.out.println("the root are"+r1+"and"+r2);
        }
        else if(d==0){
            double r=-b/(2*a);
            System.out.println("the roots are"+r);
        }
        else{
            System.out.println("the root are not possivle");
        
        }
    }
}
