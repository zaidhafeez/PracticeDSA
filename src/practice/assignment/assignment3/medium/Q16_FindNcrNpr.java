package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q16_FindNcrNpr {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        int combination = fact(n)/(fact(r)*fact(n - r));
        int permutation = fact(n)/(fact(n - r));
        System.out.println(combination + " " + permutation);

    }

    private static int fact(int n) {

        if(n < 1) return 1;

        int ans = n *fact(n -1);

        return ans;



    }

}
