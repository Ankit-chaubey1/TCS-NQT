import java.util.*;
public class PrintPrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int last=sc.nextInt();
          
        for(int i=start;i<=last;i++){
          boolean isPrime=true;
          if(i<=1){
            isPrime=false;
          }
          for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
          

    }
     if(isPrime){
            System.out.print(i+" ");
        }
}
    
}   
}
