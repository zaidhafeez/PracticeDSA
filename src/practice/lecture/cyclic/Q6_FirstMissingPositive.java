package practice.lecture.cyclic;

public class Q6_FirstMissingPositive {

    public static void main(String[] args) {
//        int[] arr = {3,4,-1,1};
//        int[] arr = {1,2,0};
        int[] arr = {7,8,9,11,12};
        sort(arr);
        System.out.println(firstMissingPositive(arr));

    }

    static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) swap(arr, i, correctIndex);
            else i++;

        }

    }

    static int firstMissingPositive(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != i + 1) return i + 1;

        }


        return arr.length + 1;


    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
