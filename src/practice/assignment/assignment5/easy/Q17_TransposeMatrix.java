package practice.assignment.assignment5.easy;

import java.util.Arrays;

public class Q17_TransposeMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

         matrix = transPoseMatrix(matrix);

        for (int[] transposeMatrix : matrix) {

            System.out.println(Arrays.toString(transposeMatrix));


        }


    }

    private static int[][] transPoseMatrix(int[][] matrix) {

        int[][] transPoseMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                transPoseMatrix[i][j] = matrix[j][i];

            }
        }
        return transPoseMatrix;
    }

//    private static void swap(int[][] matrix, int i, int j) {
//
//        int temp = matrix[i][j];
//        matrix[i][j] = matrix[j][i];
//        matrix[j][i] = temp;
//    }

}
