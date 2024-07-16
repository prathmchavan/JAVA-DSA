import java.util.Scanner;

class A {

    public static int find(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {

        int size;
        int result;
        int key;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key for search:");
        key = sc.nextInt();

        A obj = new A();
        result = obj.find(arr, key);

        if (result == -1) {
            System.out.println("Value is not present in the list.");
        } else {
            System.out.println("Value is at index " + result);
        }
        
        sc.close();
    }
}
