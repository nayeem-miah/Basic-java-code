package basicjava;

import java.util.Scanner;
public class positive {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int number=input.nextInt();
        if(number>0){
            System.out.println("positive");
               
        }
        else if (number<0){
            System.out.println("negative");
        }
        else{
             System.out.println("zero");
       }
    }
}
