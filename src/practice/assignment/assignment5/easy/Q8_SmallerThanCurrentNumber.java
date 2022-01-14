package practice.assignment.assignment5.easy;

import java.util.Arrays;
//https:leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/discuss/575760/Java-simple-to
// -complex-explained-0-ms-faster-than-100-less-space-than-100-5-lines-of-code
public class Q8_SmallerThanCurrentNumber {

    public static void main(String[] args) {

//        int[] nums = {8,1,2,2,3};
//        int[] nums = {6,5,4,8};
        int[] nums = {7,7,7,7};

        int[] res = smallerNumbersThanCurrent(nums);

        System.out.println(Arrays.toString(res));



    }

    static int[] smallerNumbersThanCurrent(int[] nums){

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int max = nums[i];
            for (int j = 0; j < nums.length; j++) {

                if(max > nums[j]) count++;

            }

            res[i] = count;

        }

        return res;




    }

}
