
package calculator;
public class Calculator {
   public static void main(String[] args) {
        //ADDITION
        System.out.println("ADDITION IS :");
        addition obj=new addition();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
        
        System.out.println("SUBTRACTIONIS :");
        subtration obj1=new subtration();
        obj1.sub(1, 20);
        obj1.sub(10, 20);
        obj1.sub(10, 110,20);
        
         System.out.println("MULTIPECTION IS :");
         multip obj2=new multip();
         obj2.mul(5, 10);
         obj2.mul(5, 10,5);
         obj2.mul(2, 3, 20, 90);
         
         
         System.out.println("DIVISION IS :");
         division obj3=new division();
         obj3.div(2, 5);
         obj3.div(100, 5, 3);
         obj.add(1000, 10, 5, 3);
         
    }
    
}
