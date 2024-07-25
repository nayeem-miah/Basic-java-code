
package arrraydemo;

import java.util.Scanner;

public class array5 {
    public static void main(String[] args){
        int[][] A=new int[2][3];
        int[][] B=new int[2][3];
        Scanner input =new Scanner(System.in) ;
        System.out.println("enter the value:");
        //getting input for A metrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                A[row][col]=input.nextInt();
            }
            
        }
        //printing A meetrix
        System.out.println("A =");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(" "+A[row][col]);
            }
             System.out.println(); 
        }
                //getting input for B metrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                B[row][col]=input.nextInt();
            }
            
        }
        //printing A meetrix
        System.out.println("B =");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col <3; col++) {
                System.out.print(" "+B[row][col]);
            }
             System.out.println(); 
        }
    }
    
}
