package revise;

public class Searching {

    public static void main(String[] args) {

        int[] arr = {14,22,23,43,67};
        int target = 46;
        System.out.println(linearSearch(arr, target));


    }

    private static boolean linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if(target == arr[i]) return true;

        }

        return false;

    }

    private static boolean binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        for (int i = start; i < arr.length; i++) {

            if(arr[mid] == target) return true;
            else if(target > arr[mid]) start = mid + 1;
            else end = mid - 1;

        }

        return false;

    }


}
