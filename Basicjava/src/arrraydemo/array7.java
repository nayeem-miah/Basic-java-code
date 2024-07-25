
package arrraydemo;

public class array7 {
    public static void main(String[] args) {
        int k=0,row,col;
        int [][]num=new int [4][];
        num[0]=new int[1];
        num[1]=new int[2];
        num[2]=new int[3];
        num[3]=new int[4];
       
        for ( row = 0; row < 4; row++) {            
            for ( col = 0; col < row+1; col++) {
                num[row][col]=k;
                k++;
                
            }
            
        }
        for ( row = 0; row < 4; row++) {
            for (  col= 0; col < row+1; col++) {
                System.out.print(" "+num[row][col]);
                
            }
            System.out.println();  
        }
    }
    
}
