class P {

    // Find the pivot in the rotated sorted array
    public static int find(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[0]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Binary search on the right half of the array
    public static int binaryr(int[] arr, int k, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Binary search on the left half of the array
    public static int binaryl(int[] arr, int k, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

public class Pivot {

    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 2, 3};
        int k = 1;

        P obj = new P();
        int pivot = obj.find(arr);

        int result;
        if (k >= arr[pivot] && k <= arr[arr.length - 1]) {
            result = P.binaryr(arr, k, pivot, arr.length - 1);
        } else {
            result = P.binaryl(arr, k, 0, pivot - 1);
        }

        System.out.println("The index of the element is: " + result);
    }
}
