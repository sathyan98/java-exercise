public class Maxmin {
    public static  void main(String args[])
    {
        int[] arr = {1,4,17,7,25,3,100};
        System.out.println("original array");
        System.out.println(arr);
        System.out.println("the smallest elament is");
        min(arr);
        System.out.println("the largest element is");
        max(arr);

    }
    private static void min(int[] arr)
    {
        int[] min = new int[arr.length];
        for(int i =0;i < arr.length;i++)
        {
            min(arr);
        }

    }
    private static void max(int[] arr)
    {
        int[] max = new int[arr.length];
        for(int i=0;i < arr.length;i++)
        {
            max(arr);
        }
    }
}














  /*  Expected Output:
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]
        K'th smallest element of the said array:
        3
        K'th largest element of the said array:
        25 */