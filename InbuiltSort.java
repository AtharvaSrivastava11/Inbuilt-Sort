/*
 * Time Complexity: O(n log n)
 * 
 * Other method:
 * import java.util.Collections; //used to print the array in reverse order .
 * Arrays.sort(arr, Collections.reverseOrder())
 * 
 * Arrays.sort(arr,si,ei,Collections.reverseOrder())
 */
import java.util.*;
public class InbuiltSort {
    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        
        display(arr);
    }
}
