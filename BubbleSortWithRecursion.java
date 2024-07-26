
public class BubbleSortWithRecursion {

    public static void bubble(int [] arr , int size)
    {
        if(size ==1 || size ==0)
        {
            return;
        }

        for(int i =0; i < size-1; i++)
        {

            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
         
        bubble(arr, size-1);
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        int size = arr.length;

        bubble(arr, size);


        for (int n : arr) {
            System.out.println(n + " ");
        }

    }
}
