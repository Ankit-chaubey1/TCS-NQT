import java.util.*;
public class ToggleBinary {
    public static void main(String[] args) {
        int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    num=sc.nextInt();
    
String binary=Integer.toBinaryString(num);
System.out.println("binary representation of "+num+" is "+binary);

String toggeld="";
for(int i=0;i<binary.length();i++){
    if(binary.charAt(i)=='0'){
        toggeld+='1';
    }else{
        toggeld+='0';
    }
}

int decimal=Integer.parseInt(toggeld,2);
System.out.println(decimal);



    }
    
}

