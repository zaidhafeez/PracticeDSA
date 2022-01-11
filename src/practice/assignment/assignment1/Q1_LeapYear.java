package practice.assignment.assignment1;

import java.util.Scanner;

public class Q1_LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        System.out.println("The year is: " + isLeapYear(year));


    }

    private static boolean isLeapYear(int year) {

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) return true;

        return false;

    }

}
