
package arrraydemo;

import java.util.Scanner;

public class metrix {
    public static void main(String[] args){
        int row,col ;
        int sum=0;
        System.out.println("input");
        Scanner input=new Scanner(System.in);
        int [][] num=new int[3][3];
        for ( row = 0; row < 3; row++) {
            for ( col = 0; col < 3; col++) {
               num[row][col]=input.nextInt();
               
            }
        }
        System.out.println("output");
        for ( row = 0; row < 3; row++) {
            for ( col = 0; col < 3; col++) {
                System.out.print(" "+num[row][col]);
                if(row==col)
                { 
                    sum=sum+num[row][col];
                }
            }
            System.out.println(); 
        }
        System.out.println("sum of sum="+sum);
    }
    
}
