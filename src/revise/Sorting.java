package revise;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {4,17,22,1};

//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) swap(arr, j, j-1);
                else break;

            }

        }


    }

    private static void selectionSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {


            int last = arr.length - i -1;
            int maxIndex = findMax(arr, 0, last);
            swap(arr, maxIndex, last);

        }

    }

    private static int findMax(int[] arr, int start, int last) {

        int max = start;
        for (int i = 1; i <= last; i++) {

            if(arr[max] < arr[i]) max = i;

        }

        return max;

    }

    private static void bubbleSort(int[] arr) {

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {

            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if(arr[j - 1] > arr[j]){
                    swap(arr, j -1, j);
                    swapped = true;
                }

            }

            if(!swapped) return;

        }

    }

    private static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
