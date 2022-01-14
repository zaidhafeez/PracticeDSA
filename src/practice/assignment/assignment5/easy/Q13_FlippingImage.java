package practice.assignment.assignment5.easy;

import java.util.Arrays;

public class Q13_FlippingImage {

    public static void main(String[] args) {

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        int[][] result = flipAndInvertImage(image);

        for (int i = 0; i < result.length; i++) {

            System.out.println(Arrays.toString(result[i]));

        }





    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int[] row : image) {

            reverse(row);
            invert(row);
            
        }
        

        return image;

    }

    private static void invert(int[] row) {

        for (int i = 0; i < row.length; i++) {


                if(row[i] == 0) row[i] = 1;
                else row[i] = 0;


        }

    }

    private static void reverse(int[] row) {

            int start = 0;
            int end = row.length - 1;

            while (start < end){

                swap(row, start, end);
                start++;
                end--;

            }

        }

    private static void swap(int[] row, int first, int second) {

        int temp = row[first];
        row[first] = row[second];
        row[second] = temp;



    }

}

    // bitwise operator // optimized way
//    public int[][] flipAndInvertImage(int[][] A) {
//        int C = A[0].length;
//        for (int[] row: A)
//            for (int i = 0; i < (C + 1) / 2; ++i) {
//                int tmp = row[i] ^ 1;
//                row[i] = row[C - 1 - i] ^ 1;
//                row[C - 1 - i] = tmp;
//            }
//
//        return A;
//    }
    
    
    // 3rd way //
//    public int[][] flipAndInvertImage(int[][] A) {
//        for (int i = 0; i < A.length; i++) {
//            int lo = 0, hi = A[0].length - 1;
//            while (lo <= hi) {
//                if (A[i][lo] == A[i][hi]) {
//                    A[i][lo] = 1 - A[i][lo];
//                    A[i][hi] = A[i][lo];
//                }
//                lo++;
//                hi--;
//            }
//        }
//
//        return A;
//    }


