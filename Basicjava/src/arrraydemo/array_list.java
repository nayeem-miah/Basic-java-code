
package arrraydemo;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {
    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Arraylist size="+number.size());
        //adding array
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(0, 50);
        number.add(2, 80);
        
        
      //  System.out.println(number);
     /* for(int x:number){//for each loop
          System.out.print(" "+x);
          sum=sum+x;
      }*/
        System.out.print("adding item");
        Iterator itr=number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        //System.out.println("sum is ="+sum);
        System.out.println("size is="+number.size());
        //removing item
        number.remove(2);
        System.out.println("after removing item"+number);
        number.removeAll(number);//remove all item
        System.out.println(number);
    }
    
}
