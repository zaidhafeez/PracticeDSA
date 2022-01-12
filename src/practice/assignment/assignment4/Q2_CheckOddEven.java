package practice.assignment.assignment4;

import java.util.Scanner;

public class Q2_CheckOddEven {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println(isEven(number));

    }

    private static boolean isEven(int number) {

        if(number % 2 == 0) return true;
        return false;


    }

}
