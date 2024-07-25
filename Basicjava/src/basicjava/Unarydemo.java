
package basicjava;


public class Unarydemo {
    public static void main(String[] args) {
    int x=10;
    int result;
    int y;
       
    result=-x;
    System.out.println("result is "+result);
    result=+x;
    System.out.println("result is "+result);
    y=x++;//next time x pela 1+ korbe
    
    
    System.out.println(y);
    y=x;
    System.out.println(y);
    y=++x;//1+korbe
    System.out.println(y);
    
    }
    
}
