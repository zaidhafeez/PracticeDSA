package practice;

import java.util.Arrays;

public class Cyclic {

    public static void main(String[] args) {

        int[] arr = {3,5,1,2,4};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr){

        int index = 0;

        while(index < arr.length){

            int correctIndex = arr[index] - 1;

            //if(arr[index] != arr[correctIndex]) It's also valid Kunal Does like
            if(index != correctIndex ){

                swap(arr, index, correctIndex);

            }
            else {

                index++;

            }

        }

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
