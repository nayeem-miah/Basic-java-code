
package arrraydemo;

import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        int sum=0;
        int row,col ;
        int x[][]=new int [2][3];
        Scanner input=new Scanner(System.in);
        System.out.println("input");
        for ( row = 0; row < 2; row++) {
            for ( col = 0; col < 3; col++) {
                x[row][col]=input.nextInt();
                
            }
        }
        System.out.println("output");
        for ( row = 0; row < 2; row++) {
            for ( col = 0; col< 3; col++) {
                System.out.print(" "+x[row][col]);
                sum=sum+x[row][col];
            }
            System.out.println();   
        }
        System.out.println("sum is "+sum);
    }
    
}
