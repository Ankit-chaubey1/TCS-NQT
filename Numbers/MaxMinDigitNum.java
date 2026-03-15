import java.util.*;
public class MaxMinDigitNum {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
   int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    while(num!=0){
        int rem=num%10;
        if(rem>max){
            max=rem;
        }
        if(rem<min){
            min=rem;
        }
       
        num/=10;
    }
    System.out.println(max);
     System.out.println(min);
 
    
    
}
}