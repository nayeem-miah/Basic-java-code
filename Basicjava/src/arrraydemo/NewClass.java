package arrraydemo;
public class NewClass {
    public static void main(String[] args) {
        int sum=0;
       /* int []num=new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        int sum=0;*/
        int [] num={10,20,30,40,50};
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
            sum=sum+num[i];
        }
        System.out.println("sum is sum="+sum);
    }
    
}
     