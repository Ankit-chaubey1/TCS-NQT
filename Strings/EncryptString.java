package Strings;
import java.util.*;
public class EncryptString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res="";
         int count=1;
         for(int i=1;i<=str.length();i++){
            if(i<=str.length()-1 && str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                res+=str.charAt(i-1)+""+count;
                count=1;
            }
            
         }
         System.out.println(res);
        String total="";
for(int i=res.length()-1;i>=0;i--){
total+=res.charAt(i);
}
System.out.println(total);
    }
    
}
