package practice;

public class Q1_MissingNumber {

    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        cyclingSort(arr);
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] arr) {

        int missingNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(i != arr[i]){

                missingNumber = i;

                return missingNumber;

            }

        }

        return missingNumber;


    }

    static void cyclingSort(int[] arr) {
        int index = 0;
        while(index < arr.length){

            int correctIndex = arr[index];

            if(arr[index] < arr.length && arr[index] != arr[correctIndex]) swap(arr, index, correctIndex);
            else index++;

        }

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
