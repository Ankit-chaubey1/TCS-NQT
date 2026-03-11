import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5,0};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println("The array is sorted: " + isSorted);
    }
    
}
