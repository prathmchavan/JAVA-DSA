
public class SelectionWithRecursion {

    public static void sel(int[] arr, int start, int size) {
        if (start >= size - 1) {
            return;
        }

        int minind = start;
        for (int i = start + 1; i < size; i++) {
            if (arr[minind] > arr[i]) {
                minind = i;
            }
        }

        int temp = arr[start];
        arr[start] = arr[minind];
        arr[minind]=temp;

        sel(arr,start+1, size );
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int size = arr.length;

        sel(arr, 0, size);

        for (int n : arr) {
            System.out.println(n + " ");
        }

    }
}
