import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
     if(num%2==0){
        System.out.println("even");
     }else{
        System.out.println("odd");
     }
       
     if(num==0){
        System.out.println("zero");
     }
     if(num>0){
        System.out.println("Positive ");
     }else if(num<0){
        System.out.println("negative");

     }
    }
}
