package practice.assignment.assignment5.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Q1_SpiralMatrix_1 {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);

        System.out.println(list);

    }

    static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int rowBegin = 0, rowEnd = m - 1;
        int colBegin = 0, colEnd = n - 1;



        while(list.size() < m * n) {

            // Traverse to right //

            for (int i = colBegin; i <= colEnd; i++) {

                list.add(matrix[rowBegin][i]);

            }
            rowBegin++;

            // Traverse to Down //

            for (int j = rowBegin; j <= rowEnd; j++) {

                list.add(matrix[j][colEnd]);

            }
            colEnd--;

            // Traverse to left //

            if (rowBegin <= rowEnd) {

                for (int i = colEnd; i >= colBegin; i--) {

                    list.add(matrix[rowEnd][i]);

                }

            }
            rowEnd--;

            // Traverse to up //

            if (colBegin <= colEnd) {

                for (int j = rowEnd; j >= rowBegin; j--) {

                    list.add(matrix[j][colBegin]);

                }

            }
            colBegin++;
        }

        return list;

    }


//    static List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> res = new LinkedList<>();
//        if (matrix == null || matrix.length == 0) return res;
//        int n = matrix.length, m = matrix[0].length;
//        int up = 0,  down = n - 1;
//        int left = 0, right = m - 1;
//        while (res.size() < n * m) {
//            for (int j = left; j <= right && res.size() < n * m; j++)
//                res.add(matrix[up][j]);
//
//            for (int i = up + 1; i <= down - 1 && res.size() < n * m; i++)
//                res.add(matrix[i][right]);
//
//            for (int j = right; j >= left && res.size() < n * m; j--)
//                res.add(matrix[down][j]);
//
//            for (int i = down - 1; i >= up + 1 && res.size() < n * m; i--)
//                res.add(matrix[i][left]);
//
//            left++; right--; up++; down--;
//        }
//        return res;
//    }

}