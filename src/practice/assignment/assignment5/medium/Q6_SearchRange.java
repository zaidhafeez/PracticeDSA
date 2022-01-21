package practice.assignment.assignment5.medium;

import java.util.Arrays;

public class Q6_SearchRange {

    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = new int[2];

        res[0] = findFirstPosition(nums, target);
        res[1] = findLastPosition(nums, target);

        System.out.println(Arrays.toString(res));

    }

    private static int findFirstPosition(int[] nums, int target) {

        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(nums[mid] >= target){

                end = mid - 1;

            }
            else start = mid + 1;
            if(nums[mid] == target) index = mid;

        }

        return index;


    }

    private static int findLastPosition(int[] nums, int target) {

        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(nums[mid] <= target){

                start = mid + 1;

            }
            else end = mid - 1;
            if(nums[mid] == target) index = mid;

        }

        return index;

    }

}

// 2nd Way Better Way //
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/14701/A-very-simple-Java-solution-with-only-one-binary-search-algorithm
