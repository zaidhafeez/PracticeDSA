package revise;

import java.util.Arrays;

public class SortingPractice {

    public static void main(String[] args) {

//        int arr[] = {5,4,3,2,1};

        int[] arr = {45,-55,15,60,05};
//        selectionSort(arr);
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0 ; j--) {

                if(arr[j] < arr[j - 1]) swap(arr, j , j - 1);
                else break;

            }

        }

    }

    private static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {

                if(arr[j - 1] > arr[j]){
                    swap(arr, j, j-1);
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }

    }

    private static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            int last = arr.length - i - 1;
            int maxIndex = findMax(arr, last);
            swap(arr, maxIndex, last);


        }

    }



    private static int findMax(int[] arr, int last) {

        int max = 0;

        for (int j = 1; j <= last; j++) {

            if(arr[max] < arr[j]) max = j;

        }

        return max;

    }

    private static void swap(int[] arr, int first, int second) {

        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
