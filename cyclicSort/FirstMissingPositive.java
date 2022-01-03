package com.company.cyclicSort;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int nums[] = {3,4,-1,-1};
        sort(nums);
        System.out.println(firstMissingPositive(nums));


    }

    private static void sort(int[] nums) {

        int i = 0;
        while (i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;

        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

    static int firstMissingPositive(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != i + 1){

                return i + 1;

            }

        }

        return arr.length + 1;

    }

}
