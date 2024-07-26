
public class InsertionWithRecusrion {

    public static void insert(int[] arr, int start, int size) {
        if (start >= size ) {
            return;
        }

        int temp = arr[start];
       int  j = start;
       
        while(j>0 && arr[j-1]>temp)
        {
            arr[j]=arr[j-1];
            j--;
        }

        arr[j]= temp;

        insert(arr,start+1, size );
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int size = arr.length;

        insert(arr, 1, size);

        for (int n : arr) {
            System.out.println(n + " ");
        }

    }
}
