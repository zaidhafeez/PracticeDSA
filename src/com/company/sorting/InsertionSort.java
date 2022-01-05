package com.company.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) {

            for (int j = i+1; j > 0; j--) {

                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

}
