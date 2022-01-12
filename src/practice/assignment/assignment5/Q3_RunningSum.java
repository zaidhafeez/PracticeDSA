package practice.assignment.assignment5;

import java.util.Arrays;

public class Q3_RunningSum {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};

//        int[] nums = {1,1,1,1,1};
        int[] nums = {3,1,2,10,1};
//        int[] ans = runningSum(nums);
        int[] ans = runningSum2(nums);
        System.out.println(Arrays.toString(ans));

    }

    // 1st way

    static int[] runningSum(int[] nums){

        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < ans.length; i++) {

            //You can use this to
//            sum += nums[i];
//            ans[i] = sum;
            // OR

            if(i == 0){

                ans[i] = nums[i];

            }
            else ans[i] = ans[i -1] + nums[i];


        }

        return ans;


    }

    //2nd Way
    static int[] runningSum2(int[] nums){

        int i = 1;

        while (i < nums.length){

            nums[i] += nums[i-1];
            i++;

        }
        return nums;
    }

}
