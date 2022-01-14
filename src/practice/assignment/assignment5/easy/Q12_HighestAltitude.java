package practice.assignment.assignment5.easy;

public class Q12_HighestAltitude {

    public static void main(String[] args) {

        int[] gain = {-5,1,5,0,-7};
//        int[] gain = {-4,-3,-2,-1,4,3,2};

        int highestAltitude = largestAltitude(gain);
        System.out.println(highestAltitude);

    }

    private static int largestAltitude(int[] gain) {

        int i = 1;
        int max = Integer.MIN_VALUE;

        int[] result = new int[gain.length + 1];

        while (i < result.length){

            result[i] = result[i - 1] + gain[i - 1];
            i++;

        }

        for (int j = 0; j < result.length; j++) {


            if(max < result[j]) max = result[j];

        }

        return max;

    }
    // -- Optimized Way -- //
        // 2nd way
//    public int largestAltitude(int[] gain) {
//        int max_alt=0;
//        int curr_alt=0;
//        for(int i=0;i<gain.length;i++){
//            curr_alt+=gain[i];
//            max_alt=Math.max(curr_alt, max_alt);
//        }
//        return max_alt;
//    }


}
