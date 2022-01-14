package practice.assignment.assignment5.easy;

public class Q1_BuildArray {

    public static void main(String[] args) {

//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArray(nums);
        for (int element : ans) {

            System.out.print(element + " ");

        }

    }

    private static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {

            ans[i] = nums[nums[i]];

        }

        return ans;

    }


    // space complexity In O(1)
    //https://leetcode.com/problems/build-array-from-permutation/discuss/1316500/Java-solution-using-O(1)-space-with-explanation
}
