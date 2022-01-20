package practice.assignment.assignment5.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_SpiralMatrix_2 {

    public static void main(String[] args) {

        int n = 4;

        int[][] matrix = generateMatrix(n);

        for (int[] elements: matrix) {

            System.out.println(Arrays.toString(elements));

        }

    }

    private static int[][] generateMatrix(int noOfSize) {

        int[][] generateMatrix = new int[noOfSize][noOfSize];

        int m = generateMatrix.length;
        int n = generateMatrix[0].length;

        int rowBegin = 0, rowEnd = m - 1;
        int colBegin = 0, colEnd = n - 1;
        int element = 1;



        while(rowBegin <= rowEnd && colBegin <= colEnd) {

            // Traverse to right //

            for (int i = colBegin; i <= colEnd; i++) {

                generateMatrix[rowBegin][i] = element++;

            }
            rowBegin++;

            // Traverse to Down //

            for (int j = rowBegin; j <= rowEnd; j++) {

                generateMatrix[j][colEnd] = element++;

            }
            colEnd--;

            // Traverse to left //

            if (rowBegin <= rowEnd) {

                for (int i = colEnd; i >= colBegin; i--) {

                    generateMatrix[rowEnd][i] = element++;

                }

            }
            rowEnd--;

            // Traverse to up //

            if (colBegin <= colEnd) {

                for (int j = rowEnd; j >= rowBegin; j--) {

                    generateMatrix[j][colBegin] = element++;

                }

            }
            colBegin++;
        }

        return generateMatrix;

    }


}
