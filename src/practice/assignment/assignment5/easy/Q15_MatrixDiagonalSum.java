package practice.assignment.assignment5.easy;

public class Q15_MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] squarematrix =
            {{1,2,3},
            {4,5,6},
            {7,8,9}};

        int sum = diagonalMatrix(squarematrix);
        System.out.println(sum);

    }

    private static int diagonalMatrix(int[][] squarematrix) {

        int sum = 0;
        int n = squarematrix.length;

        for (int i = 0; i < n; i++) {

            sum += squarematrix[i][i]; // primary diagonals are row = column
            sum += squarematrix[i][n - 1 - i]; // secondary diagonals are row + column = n - 1

        }

        return (n % 2 == 0) ? sum: sum - squarematrix[n / 2][n / 2];

    }

}
