package practice.assignment.assignment6.easy;

public class Q9_InsertSearchPosition {

    static int searchPosition(int[]arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;
            else if (target < arr[mid]){
                end = mid - 1;
                if(end < 0){
                    index = 0;
                }
                else {
                    index = end;
                }

            }
            else{
                start = start + 1;
                index = start;
            }

        }

        return index;


    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = -1;
        System.out.println(searchPosition(arr, target));

    }

}
