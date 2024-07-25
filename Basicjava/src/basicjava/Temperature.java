
package basicjava;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double cels,farn;
    System.out.println("celsius=");
    cels=input.nextDouble();
    farn=1.8*cels+32;//
    System.out.println("farhhide="+farn);
    }

    
}
