package Strings;
import java.util.*;
public class AlphabetsOnly {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String alpha="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
for(int i=0;i<str.length();i++){
    // if(alpha.indexOf(str.charAt(i))!=-1){
    //     System.out.print(str.charAt(i));
    // }

    //second logic
    if(Character.isLetter(str.charAt(i))){
        System.out.print(str.charAt(i));
    }
   
}
    }
}
