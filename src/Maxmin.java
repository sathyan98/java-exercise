import java.util.*;
public class Maxmin {
    public static  void main(String args[])
    {
        Integer[] arr = {1,4,17,7,25,3,100};
        int k = 2;
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));
        System.out.println("the smallest element of a array is");
        Arrays.sort(arr);
        System.out.println(arr[k -1]);
        System.out.println("the largest element of a array is");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k - 1]);
    }

}














  /*  Expected Output:
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]
        K'th smallest element of the said array:
        3
        K'th largest element of the said array:
        25 */