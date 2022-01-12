package practice.assignment.assignment4;

import java.util.Scanner;

public class Q14_SumNNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int sum = sumOfNnumbers(number);
        System.out.println(sum);

    }

    private static int sumOfNnumbers(int number) {

        return (number *(number + 1) )/ 2;

    }


}
