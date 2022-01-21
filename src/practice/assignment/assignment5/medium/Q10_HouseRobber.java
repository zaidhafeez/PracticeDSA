package practice.assignment.assignment5.medium;

public class Q10_HouseRobber {

    public static void main(String[] args) {

        int[] nums = {2,1,1,2};
        int ans = rob(nums);
        System.out.println(ans);

    }

    private static int rob(int[] nums) {

        int index = 0;
        int sum = 0;
        int sum2 = 0;
        while(index < nums.length){

            if(index % 2 == 0) sum += nums[index];
            else sum2 += nums[index];
            index++;

        }

        return Math.max(sum, sum2);

    }
// 2nd way most optimize // 
//    public static int rob(int[] nums)
//    {
//        int ifRobbedPrevious = 0; 	// max monney can get if rob current house
//        int ifDidntRobPrevious = 0; // max money can get if not rob current house
//
//        // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
//        for(int i=0; i < nums.length; i++)
//        {
//            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
//            int currRobbed = ifDidntRobPrevious + nums[i];
//
//            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
//            int currNotRobbed = Math.max(ifDidntRobPrevious, ifRobbedPrevious);
//
//            // Update values for the next round
//            ifDidntRobPrevious  = currNotRobbed;
//            ifRobbedPrevious = currRobbed;
//        }
//
//        return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
//    }

}
