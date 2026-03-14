import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String number=String.valueOf(num);
        int digit=number.length();
        int res=0;
        for(int i=0;i<number.length();i++){
            int curr=Character.getNumericValue(number.charAt(i));
res+=Math.pow(curr, digit);
        }
        if(res==num){
            System.out.println("armstrong");
        }else{
            System.out.println("no armstrong");
        }
    }
}
