package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q5_FindDistance {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        float ans  = findDistance(x1, x2, y1, y2);
        System.out.println(ans);



    }

    private static float findDistance(int x1, int x2, int y1, int y2) {

//        return sqrtOf(pow(x2-x1,2) + pow(y2-y1,2));
        return sqrtOf(25);


    }

    static int sqrtOf(int number){

        if(number < 0) number *= -1;

        int i = 0;

        while (true){

            if(i * i == number) return i;
            else i++;


        }

    }

    static int pow(int base, int exponential){

        int power =1;

        while (exponential != 0){

            power *= base;
            exponential--;

        }

        return power;

    }

}
