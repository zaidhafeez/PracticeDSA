package practice.assignment.assignment3.easy;

import java.util.Scanner;

public class Q25_FindMax {

    public static void main(String[] args) {

        System.out.println(findMax());


    }

    private static int findMax() {

        Scanner in = new Scanner(System.in);
        int userInput;
        int max = 0;
        while (true){

            userInput = in.nextInt();

            if (userInput != 0){
                if(max < userInput) max = userInput;
            }

            else return max;
        }


    }

}
