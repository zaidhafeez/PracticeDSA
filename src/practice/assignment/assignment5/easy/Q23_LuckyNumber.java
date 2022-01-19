package practice.assignment.assignment5.easy;

import java.util.ArrayList;
import java.util.List;

public class Q23_LuckyNumber {

    public static void main(String[] args) {

        int[][] matrix= {{3,7,8},
                         {9,11,13},
                         {15,16,17}};

        List<Integer> list = luckyNumbers(matrix);
        System.out.println(list);

    }

    static List<Integer> luckyNumbers (int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){

            int minInCol = findMinInCol(matrix, i);
            int value = matrix[i][minInCol];
            if(checkValueMaxInCol(matrix, minInCol, value)){
                list.add(value);
            }

        }

        return list;

    }

    static int findMinInCol(int[][] matrix, int i){

        int minIndex = 0;
        int min = matrix[i][minIndex];

        for(int j = 0; j < matrix[i].length; j++){

            if(matrix[i][j] < min){

                min = matrix[i][j];
                minIndex = j;


            }

        }

        return minIndex;

    }

    static boolean checkValueMaxInCol(int[][] matrix, int minIndex, int value){

        for(int k = 0; k < matrix.length; k++){

            if(matrix[k][minIndex] > value) return false;

        }

        return true;

    }

}
