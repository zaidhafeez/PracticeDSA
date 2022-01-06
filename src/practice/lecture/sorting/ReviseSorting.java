package practice.lecture.sorting;

import java.util.Arrays;

public class ReviseSorting {

    public static void main(String[] args) {

        int[] arr = {45,-55,15,60,05};
//        int[] arr = {10,20,30,40,50};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if(arr[j] < arr[j - 1]) swap(arr, j, j-1);
                else break;

            }

        }

    }

    static void bubbleSort(int[] arr){


        if(arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if(arr[j] < arr[j -1]){

                    swap(arr,j,j-1);
                    swapped = true;

                }

            }

            if(!swapped) break;

        }

    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }



    }

    static int getMaxIndex(int[] arr, int start, int last) {

        int maxIndex = start;

        for (int j = 1; j <= last ; j++) {

            if(arr[maxIndex] < arr[j]) maxIndex = j;

        }

        return maxIndex;
    }


    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
