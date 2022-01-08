package com.company.recursion;

public class Q1_RecuFibo {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(fibo(n));

    }

    static int fibo(int n){

        if(n < 2){

//            System.out.println(n);
            return n;

        }

        return (fibo(n -1) + fibo(n - 2));

    }

}
