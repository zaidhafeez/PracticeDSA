package revise;

import java.util.Arrays;

public class CyclicSortPractice {

    public static void main(String[] args) {

//        int[] arr = {5,4,3,2,1};
//        int[] arr = {3,5,1,2,4};
        int[] nums = {4,3,2,5,6,1};
        cyclicSort(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static void cyclicSort(int[] arr) {

        int i = 0;

        while(i < arr.length) {

            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]) swap(arr, i , correctIndex);
            else i++;
        }

    }

    private static void swap(int[] arr, int first, int second) {

        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
