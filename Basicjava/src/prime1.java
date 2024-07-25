
public class prime1 {
    public static void main(String[] args) {
        System.out.println("first 100 prime number is :");
        int i,j,count=0;
        for ( i = 2; i < 100; i++) {
            for ( j = 2; j <= i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                
                }
                
            }
            if(count==0)
                System.out.println(i);
            count=0;
        }
    }
    
}
