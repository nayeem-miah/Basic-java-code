package arrraydemo;

public class ARRAY3 {
    public static void main(String[] args) {
        String [] name={"nayeem","abdulbasir","raman","santo"};
       // for (int i = 0; i < 4; i++) {
            //System.out.println(name[i]);
        //}    
        int sum=0;
        for(String x:name){//for h loop
            System.out.println(x);
        }
        int[]num={10,20,30,40,50};
        for(int y:num){
            System.out.println(y);
            
            sum=sum+y;
        }
        System.out.println("sum is "+sum);
        
    }

}
