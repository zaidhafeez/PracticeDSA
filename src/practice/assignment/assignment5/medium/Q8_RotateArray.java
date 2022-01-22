package practice.assignment.assignment5.medium;

import java.util.Arrays;

public class Q8_RotateArray {

    public static void main(String[] args) {

        int[] nums = {-1,-100,3,99}; //{1,2,3,4,5,6,7};
        int k = 2;

        rotateArray(nums, k);

        System.out.println(Arrays.toString(nums));



    }

    private static void rotateArray(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;


        }

    }


}
