
package basicjava;

import java.util.Scanner;

public class Circle {
     public static void main(String[] args) {
         
        Scanner input=new Scanner(System.in);
        double radius,area;
        System.out.println("enter the number of redius");
        radius=input.nextDouble();
        area=3.1416*radius*radius;
        System.out.println("the circle area is "+area);


    }
}
