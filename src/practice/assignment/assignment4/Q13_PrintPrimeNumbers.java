package practice.assignment.assignment4;

public class Q13_PrintPrimeNumbers {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {

            if(isPrime(i)) System.out.print(i + " ");

        }

    }

    private static boolean isPrime(int number) {

        int c = 2;

        while(c * c <= number){

            if(number % c == 0) return false;
            c++;
        }

        return true;

    }


}
