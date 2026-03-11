import java.util.*;
public class MeanOfArray {
    public static void main(String[] args) {
        int []arr=new int[]{1,3,4,2,6,5,8,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int mean=sum/arr.length;
        System.out.println("The mean of the array is: " + mean);
    }
    
}
