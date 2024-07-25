
package basicjava;

import java.util.Scanner;


public class switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number=");
        int num = input.nextInt();
        String gread;
        switch(num/10){
            case 10:
            case 9:
            case 8:
                gread="A+";
                break;
            case 7:
                gread="A";
                break;
                
            case 6:
                gread="A-";
                break;
            case 5:
                gread="B";
                break;
            case 4:
                gread="C";
                break;
            default:
                gread="F";
                
        }
        System.out.println("The students greade is"+gread);
    }
    
}
