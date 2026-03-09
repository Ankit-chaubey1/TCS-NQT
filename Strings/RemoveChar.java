package Strings;
import java.util.*;
public class RemoveChar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    for(int i=0;i<str1.length();i++){
        if(str2.indexOf(str1.charAt(i))==-1){
            System.out.print(str1.charAt(i));
        }
    }
}
}
