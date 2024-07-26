public class RecursionWithArray {

    // Recursive function to check if the element is present in array or not
    public static boolean isFound(int[] arr, int index , int target) {
        if (index == arr.length - 1) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }

        return isFound(arr, index + 1 ,target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Start checking from the first index (0)
        boolean sorted = isFound(arr, 0 ,12);

        // Output the result
        System.out.println("Is the element is present in array? " + sorted);
    }
}
