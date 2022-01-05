package practice;

import java.util.ArrayList;
import java.util.List;

public class Q2_DisappearedNumber {

    public static void main(String[] args) {

//        int[] arr = {4,3,2,7,8,2,3,1};

        int[] arr = {1,1};
        sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findMissingNumber(arr));



    }

    static List<Integer> findMissingNumber(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != i + 1){

                list.add(i+1);

            }

        }

        return list;

    }

    static void sort(int[] arr) {


        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) swap(arr, i, correctIndex);
            else i++;
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
