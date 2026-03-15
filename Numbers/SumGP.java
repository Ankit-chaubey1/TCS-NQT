import java.util.*;
public class SumGP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int res=(int)(a*(Math.pow(r,n)-1)/(r-1));
        System.out.println(res);
    }
}
