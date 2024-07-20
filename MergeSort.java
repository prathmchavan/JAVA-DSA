
public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {

        int len1 = mid - low + 1;
        int len2 = high - mid;

        int[] a1 = new int[len1];
        int[] a2 = new int[len2];

        int mainIndex = low;
        for (int i = 0; i < len1; i++) {
            a1[i] = arr[mainIndex++];
        }

        mainIndex = mid + 1;
        for (int i = 0; i < len2; i++) {
            a2[i] = arr[mainIndex++];
        }

        //merge both array
        int ind1 = 0;
        int ind2 = 0;
        mainIndex = low;

        while (ind1 < len1 && ind2 < len2) {
            if (a1[ind1] <= a2[ind2]) {

                arr[mainIndex++] = a1[ind1++];
            } else {
                arr[mainIndex++] = a2[ind2++];

            }
        }

        while (ind1 < len1) {
            arr[mainIndex++] = a1[ind1++];

        }

        while (ind2 < len2) {
            arr[mainIndex++] = a2[ind2++];

        }
    }

    public static void ms(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        //left side of array
        ms(arr, low, mid);

        //right side of array
        ms(arr, mid + 1, high);

        //merge both array 
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = {2, 45, 1};
        int high = arr.length - 1;
        int low = 0;
        ms(arr, low, high);

        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }
}
