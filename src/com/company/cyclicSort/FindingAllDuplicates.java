package com.company.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindingAllDuplicates {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        sort(nums);
        System.out.println(allDuplicateElements(nums));

    }

    static void sort(int[] nums) {

        int i = 0;
        while (i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;

        }

    }

    static List<Integer> allDuplicateElements(int[] nums) {

        List<Integer> duplicateElementList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i + 1){

                duplicateElementList.add(nums[i]);

            }



        }

        return duplicateElementList;

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
