
package basicjava;


public class metrix {
    public static void main(String[] args) {
        
        int[][] x = new int[2][3];
        x[0][0]=10;
        x[0][1]=20;
        x[0][2]=30;
        x[1][0]=40;
        x[1][1]=50;
        x[1][2]=60;
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.println(" "+x[row][col]);
                
            }
            System.out.println(" ");    
        }
    }
        
        
        
   
    
}
