package com.company.recursion;

public class Q2_RecuBinarySearch {

    public static void main(String[] args) {

        int[] arr = {10,-20,30,40,50,60};

        int target = 20;

        int start = 0;
        int end = arr.length - 1;

        System.out.println(binarySearch(arr, target, start, end));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        int mid = start + (end - start) / 2;

        if(start > end) return -1;

        if (target > arr[mid]){

            start = mid  + 1;

        }
        else if (target < arr[mid]){

            end = mid - 1;

        }

        else return mid;

        return binarySearch(arr, target, start, end);

    }



}
