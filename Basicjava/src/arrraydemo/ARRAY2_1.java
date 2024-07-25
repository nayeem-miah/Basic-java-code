
package arrraydemo;

import java.util.Scanner;

public class ARRAY2_1 {
    public static void main(String[] args) {
        int arr[][]=new int[5][5];
        int i,k,j = 0;
        System.out.println("input ");
        for ( i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                Scanner sc=new Scanner(System.in);
                arr[i][j]=sc.nextInt(); 
                
            }
            
      
        }
        System.out.println("output");
        for ( k = 0; k < 2; k++) 
            System.out.println(" "+arr[j][k]);
            
        
       
    }   
}
