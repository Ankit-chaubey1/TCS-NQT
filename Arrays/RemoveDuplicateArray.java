import java.util.*;
public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,2,5,6,3};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("The array after removing duplicates is: " + set);
    }
}
