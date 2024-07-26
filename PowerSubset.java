import java.util.ArrayList;
import java.util.List;

class PowerSubset {

    public static void solve(int[] nums, List<Integer> out, int index, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(out));  // Add a copy of 'out' to 'ans'
            return;
        }

        // Exclude
        solve(nums, out, index + 1, ans);

        // Include
        int element = nums[index];
        out.add(element);
        solve(nums, out, index + 1, ans);
        out.remove(out.size() - 1);  // Backtrack
    }

    public static  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int index = 0;

        solve(nums, out, index, ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
