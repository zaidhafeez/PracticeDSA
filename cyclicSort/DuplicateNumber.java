package com.company.cyclicSort;

public class DuplicateNumber {

    public static void main(String[] args){

        int[] num = {1,3,4,2,2};

       int duplicateNumber =  findDuplicateNumber(num);
        System.out.println(duplicateNumber);


    }

    static int findDuplicateNumber(int[] nums){

        int i = 0;
        while(i < nums.length){

            int correct = nums[i] - 1;
            if(nums[i] != i + 1){

                if(nums[i] != nums[correct]) swap(nums, i, correct);
                else return nums[i];

            }
            else{
                i++;
            }




        }

        return -1;

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

}
