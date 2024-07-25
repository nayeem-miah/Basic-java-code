
package arrraydemo;

import java.util.Scanner;

public class ARRAY_1 {
    public static void main(String[] args) {
     
        int arr[]=new int[10];
        System.out.println("input");
        for (int i=0;i<5;i++) {
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
          
           
            
        }
        System.out.println("output");
        for (int j=0;j<5;j++) 
            System.out.println(" "+arr[j]*arr[j]);
            
            
        
    }
    
}
