package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q23_PerfectNumber {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println(isPerfectNumber(number));

    }

    private static boolean isPerfectNumber(int number) {

        int i = 1;
        int sum = 0;
        int originalNumber = number;

        while (i < number){

            if(number % i == 0) {
//                number = number % i;
                sum += i;
            }
            i++;

        }

        if(sum == originalNumber) return true;
        else return false;

    }

}
