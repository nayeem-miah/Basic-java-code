
package arrraydemo;

import java.util.Arrays;


public class array8 {
    public static void main(String[] args) {
        int []number={10,-3,16,18,15};
        Arrays.sort(number);
        System.out.print("Assending = ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println();
        System.out.print("Dessending = ");
        for (int i =4; i >= 0; i--) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println();
        System.out.print("Assending:");
        String names[]={"nayeem","anisul_sir","muhammed","abdul_basir"};
        Arrays.sort(names);
        for (int i = 0; i < 4; i++) {
            System.out.print(", "+names[i]);
            
        }
        System.out.println();
        System.out.print("Dessending:");
        for (int i = 3; i >= 0; i--) {
            System.out.print(" ,"+names[i]);
            
            
        }
    }
    
}
