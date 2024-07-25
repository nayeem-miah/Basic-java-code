
package arrraydemo;

public class arrray6 {
    public static void main(String[] args){
        int k=0;
        int number[][]=new int[4][5];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                number [row][col]=k;
                k++;
                
            }
            
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+number[row][col]);
                
            }
            System.out.println();
        }
    }
    
}
