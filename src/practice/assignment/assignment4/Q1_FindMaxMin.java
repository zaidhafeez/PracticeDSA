package practice.assignment.assignment4;

import java.util.Scanner;

public class Q1_FindMaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int maximumNumber = findMax(number1,number2,number3);
        int minimumNumber = findMin(number1,number2,number3);

        System.out.println(maximumNumber + " "+ minimumNumber);


    }

    private static int findMin(int number1, int number2, int number3) {

        int min = number1;

        if(number2 < min) min = number1;
        if(number3 < min) min = number3;

        return min;

    }

    private static int findMax(int number1, int number2, int number3) {

        if(number1 > number2){

            if (number1 > number3) return number1;
            else return number3;

        }
        else{

            if (number2 > number3) return number2;
            else return number3;

        }

    }


}
