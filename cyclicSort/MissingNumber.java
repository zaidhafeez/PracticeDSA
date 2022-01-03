package com.company.cyclicSort;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {4,0,2,1};
        sort(nums);

        System.out.println(missingNumber(nums));


    }

    private static void sort(int[] nums) {

        int i = 0;
        while (i < nums.length){

            int correct = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;

        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

    static int missingNumber(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i){

                return i;

            }

        }

        return nums.length;


    }

}
