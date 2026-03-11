import java.util.*;
public class LargestNumArray {
    public static void main(String[] args) {
        int []arr=new int[]{12,34,54,32};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest number in the array is: " + largest);
    }
}
