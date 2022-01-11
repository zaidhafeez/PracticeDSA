package practice.assignment.assignment3.easy;

import java.util.Scanner;

public class Q22_DiffSumProduct {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int ans = diffSumproduct(number1);

        System.out.println(ans);

    }

    private static int diffSumproduct(int number1) {

        int sum = 0;
        int product = 1;

        while (number1 != 0){

            int digit = number1 % 10;
            sum += digit;
            product *= digit;
            number1 /= 10;

        }

        return product - sum;

    }

}
