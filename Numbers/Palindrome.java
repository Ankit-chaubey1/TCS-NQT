import java.util.*;
public class Palindrome{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         int rev=0;
            int temp=num;
            while(temp!=0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }
            if(num==rev){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }
    }
}