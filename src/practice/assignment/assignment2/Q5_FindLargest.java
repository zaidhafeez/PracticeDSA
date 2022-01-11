package practice.assignment.assignment2;

import java.util.Scanner;

public class Q5_FindLargest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();


        int max = findLargest(number1, number2, number3);
        System.out.println("The maximum number is : " + max);

    }

    private static int findLargest(int number1, int number2, int number3) {

        if (number1 > number2){
            if(number1>number3) return number1;
            else return number3;

        }
        else{

            if(number2 > number3) return number2;
            else return number3;


        }

    }

}
