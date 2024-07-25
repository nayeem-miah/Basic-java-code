
package arrraydemo;

public class Array {
    public static void main(String[] args) {
        int []number =new int [5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        System.out.println(number[4]);
        int sum=number[0]+number[1]+number[2];
        System.out.println("this number sum is="+sum);
        //array size 
        int len=number.length;
        System.out.println("array size="+len);
        
        
    }
    
}
