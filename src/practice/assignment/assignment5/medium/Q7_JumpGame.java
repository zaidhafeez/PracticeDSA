package practice.assignment.assignment5.medium;

public class Q7_JumpGame {

    public static void main(String[] args) {

//        int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        boolean canJump = canJump(nums);
        System.out.println(canJump);


    }

    private static boolean canJump(int[] nums) {
        int dis = 0;
        for (int i = 0; i <= dis; i++) {

            dis = Math.max(dis, i + nums[i]);

            if(dis >= nums.length - 1){

                return true;

            }

        }

        return false;

    }

    // 2nd Way More Optimize //
//    public boolean canJump(int[] nums) {
//        int maxLocation = 0;
//        for(int i=0; i<nums.length; i++) {
//            if(maxLocation<i) return false; // if previous maxLocation smaller than i, meaning we cannot reach location i, thus return false.
//            maxLocation = Math.max(i+nums[i], maxLocation); // greedy:
//        }
//        return true;
//    }

}
