import java.util.Arrays;

// sliding widow approach 
class PermutationOfString {
    public static  boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Populate the frequency array for s1
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays for the first window
        if (Arrays.equals(s1Count, s2Count)) return true;

        // Slide the window over s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // Include a new character in the window
            s2Count[s2.charAt(i) - 'a']++;
            // Exclude the old character from the window
            s2Count[s2.charAt(i - s1.length()) - 'a']--;

            // Compare the frequency arrays for the current window
            if (Arrays.equals(s1Count, s2Count)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
      
        
        String s1 = "algorithm";
        String s2 = "altruistic";

        boolean result = checkInclusion(s1, s2);

        if (result) {
            System.out.println("A permutation of " + s1 + " is a substring of " + s2);
        } else {
            System.out.println("No permutation of " + s1 + " is a substring of " + s2);
        }
    }
}

// usig normal recursion and backtracking but it is inefficient for large string


// import java.util.ArrayList;
// import java.util.List;

// public class PermutationOfString {

//     public static String swap(String str, int index, int j) {
//         char[] charArray = str.toCharArray();
//         char temp = charArray[index];
//         charArray[index] = charArray[j];
//         charArray[j] = temp;
//         return new String(charArray);
//     }

//     public static void solve(String str, List<String> ans, int index) {
//         if (index >= str.length()) {
//             ans.add(str);
//             return;
//         }

//         for (int j = index; j < str.length(); j++) {
//             str = swap(str, index, j);
//             solve(str, ans, index + 1);
//             str = swap(str, index, j); // backtrack
//         }
//     }

//     public static void main(String[] args) {
//         int index = 0;
//         List<String> ans = new ArrayList<>();

//         String str = "ab";
//         String s2 = "eidbaooo";
//         solve(str, ans, index);

//         boolean found = false;

//         for (String permutation : ans) {
//             if (s2.contains(permutation)) {
//                 found = true;
//                 System.out.println("Found permutation: " + permutation);
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("No permutation of " + str + " is a substring of " + s2);
//         }
//     }
// }
