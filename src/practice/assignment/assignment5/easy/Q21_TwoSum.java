package practice.assignment.assignment5.easy;

import java.util.Arrays;

public class Q21_TwoSum {

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
        int[] nums = {3,3};
        int target = 6;

        int[] res = twoSums(nums, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) return new int[]{i, j};

            }
        }

        return new int[]{-1, -1};

    }


}
