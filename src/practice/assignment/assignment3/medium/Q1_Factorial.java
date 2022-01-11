package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q1_Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();

        int ans = fact(number1);
        System.out.println(ans);

    }

    private static int fact(int number1) {

        int fact = 1;

        while (number1 != 0){

            fact *= number1;
            number1--;

        }

        return fact;

    }



}
