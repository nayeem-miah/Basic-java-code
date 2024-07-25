
package arrraydemo;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        int sum,sub,mul;
        int div;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int num1 = input.nextInt();
        System.out.print("enter 2nd number :");
        int num2=input.nextInt();
        sum=num1+num2;
        System.out.println("sum is "+sum);
        sub=num1-num2;
        System.out.println("sub is ="+sub);
        mul=num1*num2;
        System.out.println("multiple is ="+mul);
        div=num1/num2;
        System.out.println("division is ="+div);
    }
    
}
