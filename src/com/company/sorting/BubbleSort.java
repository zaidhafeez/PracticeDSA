package com.company.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {40,20,10,60,05};
//        int[] arr = {10,20,30,40,50};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums){

        for (int i = 0; i < nums.length; i++) {

            boolean swapped = false;

            for (int j = 1; j < nums.length - i; j++) {

                if (nums[j] < nums[j - 1] ){
                    swap(nums, j, j -1);
                    swapped = true;
                }

            }

            if(!swapped){
                break;
            }

        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }


}
