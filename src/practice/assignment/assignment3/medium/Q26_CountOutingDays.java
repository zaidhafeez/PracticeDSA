package practice.assignment.assignment3.medium;

public class Q26_CountOutingDays {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 31 ; i++) {

            if(isEven(i)) count++;

        }

        System.out.println(count);

    }

    private static boolean isEven(int i) {

        return i % 2 == 0;

    }

}
