package com.company.bitwise;

public class FindUnique {

    public static void main(String[] args) {

        int[] arr = {2,3,3,4,2,6,4};
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        System.out.println(unique);
    }


}
