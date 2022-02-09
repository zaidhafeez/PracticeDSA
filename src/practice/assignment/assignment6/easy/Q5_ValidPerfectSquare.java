package practice.assignment.assignment6.easy;

public class Q5_ValidPerfectSquare {

    static boolean isPerfectSquare(int num){

        int x = num;

        while(x > num / x){

            x = (x + num / x) / 2;

        }

        return x * x == num;

    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(5666666));

    }


}
