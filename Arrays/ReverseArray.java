import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5};
        System.out.println("The original array is: " + Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

        
    }
}
