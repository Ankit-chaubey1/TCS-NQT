import java.util.*;
public class SecondLargestNumArray {
    public static void main(String[] args) {
        int []arr=new int[]{12,34,54,32};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
