package practice.assignment.assignment5.easy;

import java.util.Arrays;

public class Q25_ReshapeArray {

    public static void main(String[] args) {

        int[][] nums = {{1,2},{3,4}};
        int r = 1, c = 4;

        int[][] res = matrixReshape(nums, r, c);

        for (int[] ans: res) {

            System.out.println(Arrays.toString(ans));

        }

    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {

        int m = nums.length, n = nums[0].length;

        if(r * c != n * m) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {

            res[i / c][i % c] = nums[i / n][i % n];

        }

        return res;

    }

}
