package practice.assignment.assignment5.easy;

import java.util.ArrayList;

public class Q23_LuckyNumber {

    public static void main(String[] args) {

        int[][] matrix= {{3,7,8},
                         {9,11,13},
                         {15,16,17}};

        ArrayList<Integer> list = luckyNumber(matrix);
        System.out.println(list);

    }

    private static ArrayList<Integer> luckyNumber(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int min = matrix[0][0];
        int max = min;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

               if(matrix[i][j] < min) {

                   min = matrix[i][j];

               }

               if(min > matrix[j][i]) list.add(min);

            }

        }

        return list;

    }

}
