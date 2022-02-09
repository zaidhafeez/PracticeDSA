package practice.assignment.assignment6.easy;

public class Q2_GuessHigherLower extends GuessNumber{

    static int guessNumber(int number){

        int start = 1;
        int end = number;
        while(start <= end){

            int mid  = start + (end - start) / 2;

            if(GuessNumber.guess(mid) == 0) return mid;

            if(GuessNumber.guess(mid) == -1) end = mid - 1;
            else if(GuessNumber.guess(mid) == 1) start = mid + 1;

        }

        return -1;



    }

    public static void main(String[] args) {

        System.out.println(guessNumber(10));

    }



}

class GuessNumber{

    static int num = 3;

    public static int guess(int number){

        if(number > num) return -1;
        else if (number < num) return 1;
        else return 0;

    }


}
