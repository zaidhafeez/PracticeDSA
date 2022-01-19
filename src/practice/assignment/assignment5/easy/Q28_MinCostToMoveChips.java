package practice.assignment.assignment5.easy;

public class Q28_MinCostToMoveChips {

    public static void main(String[] args) {

        int[] positions = {1,2,3};
        int ans = minCostToMoveChips(positions);
        System.out.println(ans);


    }

    private static int minCostToMoveChips(int[] positions) {

        int even = 0, odd = 0;

        for (int i : positions) {
            if (i % 2 == 0) even++;
            else odd++;
        }

        return Math.min(even, odd);

    }


}
