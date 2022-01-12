package practice.assignment.assignment4;

import java.util.Scanner;

public class Q7_CheckPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println(isPrime(number));

    }

    private static boolean isPrime(int number) {

        int c = 2;

        while (c * c <= number){

            if(number % c == 0) return false;
            c++;

        }

        return true;



    }


}
