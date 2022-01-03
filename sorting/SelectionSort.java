package com.company.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
//        int[] arr = {40,20,10,60,05};
        int[] arr = {10,20,30,40,50};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr,last);
            swap(arr,maxIndex,last);
        }
        
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMaxIndex(int[] arr, int last) {
        
        int maxIndex = 0;
        for (int i = 1; i <= last; i++) {
            
            if(arr[i] > arr[maxIndex]){
                
                maxIndex = i;
                
            }
            
        }
        return maxIndex;
        
    }

}
