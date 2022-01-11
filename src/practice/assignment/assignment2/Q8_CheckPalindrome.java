package practice.assignment.assignment2;

import java.util.Scanner;

public class Q8_CheckPalindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = "abba";
        System.out.println("Is string palindrome : " + isPalindrome(name));


    }

    private static boolean isPalindrome(String name) {

        int start = 0;
        int end = name.length() - 1;

        while(start < end){

            if(name.charAt(start) != name.charAt(end)) return false;
            start++;
            end--;
        }

        return true;

    }


}
