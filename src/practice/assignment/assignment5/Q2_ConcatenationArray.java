package practice.assignment.assignment5;

import java.util.Arrays;

public class Q2_ConcatenationArray {

    public static void main(String[] args) {

//        int[] nums = {1,2,1};
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));



    }

    static int[] getConcatenation(int[] nums){

        int n = nums.length;

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

//            ans[i] = nums[i];
//            ans[i + n] = nums[i];

            ans[i + n] = ans[i] = nums[i];

        }

        return ans;

    }

}
