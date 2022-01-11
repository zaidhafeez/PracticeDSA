package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q2021_FindHCF_LCM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        int hcf = findHcf(number1, number2);
        int lcm = (number1 * number2) / hcf;

        System.out.println(hcf + " " + lcm);

    }

    private static int findHcf(int number1, int number2) {

        int rem = number2 % number1;

        while (rem != 0){

            number2 = number1;
            number1 = rem;
            rem = number2 % number1;

        }

        int hcf = number1;

        return hcf;


    }

}
