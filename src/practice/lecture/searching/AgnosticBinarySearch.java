package practice.lecture.searching;

public class AgnosticBinarySearch {

    public static void main(String[] args) {
//        int[] arr = {60,50,40,30,20,10};
        int[] arr = {19,18,14,12,10,9,4,2};
        int target = 18;
//        reverse(arr);
        System.out.println(orderAgnosticBinarySearch(arr, target));

    }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            swap(arr,start,end);
            start++;
            end--;

        }

    }

    static int orderAgnosticBinarySearch(int[] arr, int target){


        int start = 0;
        int end = arr.length -1;
        boolean isAsc = false;

        if(arr[start] < arr[end]){

            isAsc = true;

        }

        while (start <= end){

            int mid = start + (end - start)/2;

            if(isAsc){

                if(target < arr[mid]) end = mid - 1;
                else if(target > arr[mid]) start = mid + 1;
                else return mid;

            }
            else{

                if(target > arr[mid]) end = mid - 1;
                else if(target < arr[mid]) start = mid + 1;
                else return mid;

            }

        }

        return -1;

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }



}
