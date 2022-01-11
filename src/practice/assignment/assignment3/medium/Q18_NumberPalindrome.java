package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q18_NumberPalindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(isPalindrome(number));

    }

    private static boolean isPalindrome(int number) {

        int revNumber = 0;

        while(number > revNumber){

            int digit = number % 10;
            revNumber = revNumber * 10 + digit;
            number /= 10;

        }

        if(number == revNumber || number == revNumber / 10) return true;

        return false;

    }

}
