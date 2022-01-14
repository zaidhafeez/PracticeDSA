package practice.assignment.assignment5.easy;

public class Q16_NumberWithEvenDigits {

    public static void main(String[] args) {

//        int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};
        int count = 0;

        for (int number : nums) {

            if(isEvenNoOfDigits(number)) count++;

        }

        System.out.println(count);




    }

    private static boolean isEvenNoOfDigits(int number) {

        int count = 0;

        while (number != 0){

            number /= 10;
            count++;

        }

        return (count % 2 == 0);

    }


    // 2nd way Optimization //

//    public int FindNumbers(int[] nums) {
//
//        if(nums == null || nums.Length == 0)
//            return 0;
//
//        int cnt = 0;
//        foreach(int num in nums)
//        {
//            if((Math.Floor(Math.Log10(num) + 1)) % 2 == 0)
//                cnt++;
//        }
//
//        return cnt;
//    }
}

