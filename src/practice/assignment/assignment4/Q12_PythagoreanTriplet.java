package practice.assignment.assignment4;

import java.util.Scanner;
// Edge case is not added
public class Q12_PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        System.out.println(isPythagoreanTriplet(number1, number2, number3));


    }

    private static boolean isPythagoreanTriplet(int number1, int number2, int number3) {

        if(sqrOf(number3) == sqrOf(number1) + sqrOf(number2)) return true;
        return false;

    }

    private static int sqrOf(int number) {

        int c = 2;
        int square = 1;
        while (c > 0){

            square *= number;
            c--;

        }

        return square;

    }


}
