
package basicjava;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double b,h,area;
        System.out.println("enter the number of b");
        b=input.nextDouble();
        System.out.println("enter the number of h");
        h=input.nextDouble();
        
        area=0.5*b*h;
        System.out.println("this triangle area is "+area);
    }
    
}
