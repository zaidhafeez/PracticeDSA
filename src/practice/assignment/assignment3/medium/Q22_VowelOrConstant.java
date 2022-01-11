package practice.assignment.assignment3.medium;

import java.util.Scanner;

public class Q22_VowelOrConstant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String ch = in.next();
        System.out.println(isVowel(ch));

    }

    private static boolean isVowel(String ch) {

        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) return true;
        else return false;

    }

}
