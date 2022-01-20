package practice.assignment.assignment5.medium;

import java.util.Arrays;

public class Q5_ProductExceptSelf {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];

        int left, right;

        left = 1;
        for (int i = 0; i < size; i++) {

            if(i > 0){
                left = left * nums[i - 1];
            }

            res[i] = left;
        }
        right = 1;
        for (int i = size -1; i >= 0 ; i--) {


            if(i < size - 1) right *= nums[i + 1];
            res[i] *= right;

        }

        return res;

    }

}
