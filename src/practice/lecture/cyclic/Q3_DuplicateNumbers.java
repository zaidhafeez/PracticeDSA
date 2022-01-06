package practice.lecture.cyclic;

public class Q3_DuplicateNumbers {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,2,2};
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {

            int element  = arr[i];
            int correctIndex = arr[i] - 1;
            if(element != i + 1){

                if(arr[i] != arr[correctIndex]) swap(arr, i , correctIndex);
                else return arr[i];

            }
            else i++;
        }

        return Integer.MIN_VALUE;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


}
