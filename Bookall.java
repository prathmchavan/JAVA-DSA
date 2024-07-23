
public class Bookall {

    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
            if (studentCount > m) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int m = 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }

        System.out.println("" + ans);

    }
}
