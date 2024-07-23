public class Testing {

    // Recursive function to check if the array is sorted
    public static boolean isSorted(int[] arr, int index , int target) {
        // Base case: if we've reached the end of the array
        if (index == arr.length - 1) {
            return false;
        }

        // Check if the current element is greater than the next element
        if (arr[index] == target) {
            return true;
        }

        // Recursive call to check the rest of the array
        return isSorted(arr, index + 1 ,target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Start checking from the first index (0)
        boolean sorted = isSorted(arr, 0 ,12);

        // Output the result
        System.out.println("Is the arr? " + sorted);
    }
}
