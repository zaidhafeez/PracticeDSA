package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        withdraw();
        int a = 5;
        int b = 6;
        int c = 3;
        int ans  = sum(a,b,c); // actual argument

        greeting();

//        System.out.println(message);

    }

    static void greeting(){

        System.out.println("Assalam");

    }

    private static int sum(int first, int second,int third) {

        int add = first + second;

        return add;

    }

    // Syntax  returntype fcnName();
        //         returnType fcnName(a, b, c) // parametrized fcn
//    static void withdraw(){
//
//        System.out.println("I am with drwaing money");
//        deposit();
//
//    }

//    static void deposit(){
//
//        System.out.println("I am depositing the money");
//
//    }
}

