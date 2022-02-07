package practice.assignment.assignment6.easy;

import java.util.Arrays;

public class Q4_TwoSumII {

    public static void main(String[] args) {

//        int[] numbers = {2, 7, 11, 15};
        //        int target = 9;
//        int[] numbers = {-1, 0};
//        int target = -1;
        int[] numbers = {2,3,4};
        int target = 6;




        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while(start < end){

            int s = numbers[start] + numbers[end];
            if(s == target){
                return new int[]{start + 1, end + 1};
            }
            else if(s < target) start++;
            else end--;

        }

        return new int[]{-1,-1};

    }

}
