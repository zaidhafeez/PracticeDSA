package practice.assignment.assignment1;

import java.util.Scanner;

public class Q4_HCF_LCM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        System.out.println("The HCF is : " + findHcf(number1, number2));
        System.out.println("The L.C.M is: " + findLcm(number1, number2));

    }

    private static int findLcm(int number1, int number2) {

        int max = (number1 > number2) ? number1 : number2;

        while (true){



            if(max % number1 == 0 && max % number2 == 0) return max;
            else max++;

        }



    }

    private static int findHcf(int number1, int number2) {

        while (number1 != number2){

            if(number1 > number2) number1 = number1 - number2;
            else number2  = number2 - number1;


        }

        return number1;

    }

}
