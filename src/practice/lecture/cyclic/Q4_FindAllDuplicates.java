package practice.lecture.cyclic;

import java.util.ArrayList;
import java.util.List;

public class Q4_FindAllDuplicates {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        cyclingSort(arr);
        System.out.println(findAllDuplicates(arr));


    }

    static void cyclingSort(int[] arr) {
        int index = 0;
        while(index < arr.length){

            int correctIndex = arr[index] - 1;

            if(arr[index] != arr[correctIndex]) swap(arr, index, correctIndex);
            else index++;

        }

    }

    static List<Integer> findAllDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if(i + 1 != arr[i]){

                list.add(arr[i]);

            }

        }

        return list;


    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
