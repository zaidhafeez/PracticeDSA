package practice.assignment.assignment5.medium;

import java.util.Arrays;
// OPTIMIZE SOLUTION //
//https://leetcode.com/problems/spiral-matrix-iii/discuss/158970/C%2B%2BJavaPython-112233-Steps

public class Q3_SpiralMatrix_3 {

    static int index = 0;
    static int[][] visitedMatrix;

    public static void main(String[] args) {

        int row = 1, col = 4;
        int rStart = 0, cStart = 0;

        int[][] spiralMatrix = spiralMatrixIII(row, col, rStart, cStart);

        for (int[] elements: spiralMatrix) {

            System.out.print(Arrays.toString(elements));

        }


    }

    static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= x && x < R && 0 <= y && y < C)
                    res[j++] = new int[] {x, y};
                x += dx;
                y += dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;
    }

    private static int[][] generateMatrix(int rows, int cols, int rStart, int cStart) {

        int len = 1;
        visitedMatrix = new int[rows * cols][2];

        while(index < rows * cols){


            for (int i = 0; i < len; i++) add(rStart, cStart++, rows, cols);
            for (int i = 0; i < len; i++) add(rStart++, cStart, rows, cols);
            len++;
            for (int i = 0; i < len; i++) add(rStart, cStart--, rows, cols);
            for (int i = 0; i < len; i++) add(rStart--, cStart, rows, cols);
            len++;
            
        }

        return visitedMatrix;

    }

    private static void add(int rStart, int cStart, int rows, int cols) {

        if (rStart >= rows || rStart < 0 || cStart >= cols || cStart < 0) return;
        visitedMatrix[index][0] = rStart;
        visitedMatrix[index++][1] = cStart;

    }

}
