
package basicjava;

public class forloop {
    public static void main(String[] args){
        int sum=0;
        for (int i=1;i<=100;i=i+1){
            if(i==50){
                break;//breck; keyword
            
            }
            if(i==45)//1 statment so {} doesnot metter
                continue;
            System.out.println(i);
            sum=sum+i;
       
        }
        
       
        System.out.println(" sum is "+sum);
    }
    
}
