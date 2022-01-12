package practice.assignment.assignment5;

public class Q7_GoodPairs {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,1,1,3};
//        int[] nums = {1,1,1,1};
        int[] nums = {1,2,3};
        int noOfGoodPairs = numOfIdenticalPairs(nums);
        System.out.println(noOfGoodPairs);

    }

    private static int numOfIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int key = nums[i];

            for (int j = i + 1; j < nums.length ; j++) {

                if(key == nums[j]) count++;

            }

        }

        return count;

    }

//    public int numIdenticalPairs(int[] A) {
//        int res = 0, count[] = new int[101];
//        for (int a: A) {
//            res += count[a]++;
//        }
//        return res;
//    }

}
