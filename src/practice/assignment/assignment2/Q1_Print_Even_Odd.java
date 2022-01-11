package practice.assignment.assignment2;

import java.util.Scanner;

public class Q1_Print_Even_Odd {

    public static void main(String[] args) {

        for (int number = 1; number < 100; number++) {
//            if(isEven(number)) System.out.print(number + " ");
            if(!isEven(number)) System.out.print(number + " ");
        }


    }

    private static boolean isEven(int number) {

        return (number % 2 == 0);

    }

}
