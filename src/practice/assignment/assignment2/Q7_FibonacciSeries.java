package practice.assignment.assignment2;

import java.util.Scanner;

public class Q7_FibonacciSeries {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int noOfTerms = in.nextInt();

        fibonacciSeries(noOfTerms);

    }

//    static void fibonacciSeries(int noOfTerms) {
//
//        int term1 = 0;
//        int term2 = 1;
//        int term3 = 0;
//
//        for (int i = 0; i < noOfTerms; i++) {
//
//            if(i < 2){
//
//                System.out.print(i + " ");
//
//            }
//            else{
//
//                term3 = term1 + term2;
//                term1 = term2;
//                term2 = term3;
//                System.out.print(term3 + " ");
//
//
//            }
//
//
//
//
//        }
//
//
//    }


    static void fibonacciSeries(int noOfTerms){

        int i = 1;
        int term1 = 0;
        int term2 = 1;
        int term3 = 0;
        while (i <= noOfTerms){

            System.out.print(term1 + " ");
            term3 = term1 + term2;
            term1 = term2;
            term2 = term3;

            i++;

        }
    }
}
