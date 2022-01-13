package practice.assignment.assignment5;
// -- For Advanced -- //
// we can solve this by using Arrays.stream(nums).sum() API //
public class Q4_RichWealth {

    public static void main(String[] args) {

        int[][] accounts= {{1,2,3},{3,2,1}};

        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);


    }

    private static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] customer : accounts) {

            int sum = 0;

            for (int wealth : customer) {
                sum += wealth;
            }

            if(max < sum) max = sum;

        }

        return max;

    }

}
