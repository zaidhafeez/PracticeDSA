package practice.assignment.assignment5.easy;

import java.util.ArrayList;

public class Q6_KidWithCandies {

    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        ArrayList<Boolean> ansList = kidWithCandies(candies, extraCandies);
        System.out.println(ansList);

    }

    private static ArrayList<Boolean> kidWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {


            if(max < candies[i]) max = candies[i];

        }

        for (int i = 0; i < candies.length; i++) {

//            if((candies[i] + extraCandies) >= max) list.add(true);
//            else list.add(false);

            list.add((candies[i] + extraCandies) >= max);



        }

        return list;

    }


}
