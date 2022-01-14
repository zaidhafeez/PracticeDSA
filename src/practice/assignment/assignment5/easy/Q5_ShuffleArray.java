package practice.assignment.assignment5.easy;

// It can be optimised using bitwise operator //

// -- https://leetcode.com/problems/shuffle-the-array/discuss/675956/In-Place-O(n)-Time-O(1)-Space-With-Explanation-and-Analysis--//

import java.util.Arrays;

public class Q5_ShuffleArray {

    public static void main(String[] args) {

//        int[] nums = {2,5,1,3,4,7};
//        int n = 3;

        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = shuffleArray(nums, n);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] shuffleArray(int[] nums, int n) {

        int index = 0;
        int j = n;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[index++] = nums[i];
            ans[index++] = nums[j];
            j++;
        }

        return ans;

    }
    // Another solution //
//        public int[] Shuffle(int[] nums, int n) {
//            int i = 0;
//            int window = n;
//            while (--window > 0)
//                for (int k = ++i; k < n; k++)
//                    (nums[k], nums[k+window]) = (nums[k+window], nums[k]);
//            return nums;
//        }
//    }


}
