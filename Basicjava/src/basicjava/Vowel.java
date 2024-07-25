
package basicjava;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("enter any letter");
        ch=input.next().charAt(0);
       /* if(ch=='a'){
            System.out.println("vowel");
        }
        else if(ch=='e'){
            System.out.println("vowel");
        } 
        else if(ch=='i'){
            System.out.println("vowel");
        }
        else if (ch=='o'){
            System.out.println("vowel");
        }
        else if(ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }*/
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){ //logical or = ||
            System.out.println("vowel");
        } 
        else{
            System.out.println("consonant");
        }
    }   
}
