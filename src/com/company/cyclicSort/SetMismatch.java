package com.company.cyclicSort;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        sort(arr);
        System.out.println(Arrays.toString(findingErrorNums(arr)));
    }

    static int[] findingErrorNums(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){

                return new int[]{arr[i],i+1};

            }
        }
        return new int[]{-1,-1};


    }

    private static void sort(int[] arr) {

        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){

                swap(arr,i,correct);

            }
            else{
                i++;
            }


        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

}
