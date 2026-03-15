import java.util.*;
public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        if(num==0 || num==1){
 System.out.print(a);
        }
         System.out.print(a+" "+b+" ");
        for(int i=2;i<num;i++){
           
            int c=a+b;
            a=b;
            b=c;
      System.out.print(c+" ");
        }
  
       
        
    }
}
