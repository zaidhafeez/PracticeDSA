package practice.assignment.assignment3.easy;

import java.util.Scanner;

public class Q21_FibonacciNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();

        int ans = nthFibonacci(number1);
        System.out.println(ans);

    }

    private static int nthFibonacci(int number1) {

        int i = 1;
        int term1 = 0;
        int term2 = 1;
        int term3 = 0; // initially it is zero

        while(i <= number1){

            if(i == number1) return term1;
            term3 = term1 + term2;
            term1 = term2;
            term2 = term3;

            i++;

        }

        return Integer.MIN_VALUE;

    }

}
