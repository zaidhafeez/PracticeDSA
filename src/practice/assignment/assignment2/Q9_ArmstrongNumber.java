package practice.assignment.assignment2;

public class Q9_ArmstrongNumber {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {

            if(isArmstrongNumber(i)) System.out.print(i + " ");

        }
    }

    private static boolean isArmstrongNumber(int i) {

        int originalNumber = i;
        int sum = 0;
        while(i != 0){

            int rem = i % 10;
            int cubeOfRem = rem * rem *rem;

             sum += cubeOfRem;
            i /= 10;

        }

        return sum == originalNumber;

    }

}
