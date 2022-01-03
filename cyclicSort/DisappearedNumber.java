package com.company.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        sort(nums);
        System.out.println(missingNumber(nums));

    }

    static void sort(int[] nums){

        int i = 0;
        while (i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) swap(nums,i,correct);
            else i++;

        }

    }

   static void swap(int[] nums, int first, int second) {

       int temp = nums[first];
       nums[first] = nums[second];
       nums[second] = temp;


    }

    static List<Integer> missingNumber(int[] nums){

        ArrayList<Integer> missingNumberList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) missingNumberList.add(i + 1);

        }

        return missingNumberList;


    }

}
