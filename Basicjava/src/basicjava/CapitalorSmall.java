
package basicjava;

import java.util.Scanner;
 
public class CapitalorSmall {
    public static void main(String[] args){
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("enter any letter");
        ch=input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){//a-z
            
            System.out.println("small");
            
        }
        else if(ch>='A' && ch<='Z'){//A-Z
            
            System.out.println("capital");
        }
        else{
            System.out.println("not  a letter");
        }
    }
}
