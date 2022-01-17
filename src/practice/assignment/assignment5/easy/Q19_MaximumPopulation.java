package practice.assignment.assignment5.easy;

public class Q19_MaximumPopulation {

    public static void main(String[] args) {

        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};

        int maxYear = findMaxPopulation(logs);

        System.out.println(maxYear);


    }

    private static int findMaxPopulation(int[][] logs) {

        int[] year = new int[101];

        for (int[] log: logs) {

            year[log[0] - 1950]++;
            year[log[1] - 1950]--;

        }

        int maxYear = year[0], maxNum = 1950;

        for (int i = 1; i < year.length; i++) {

            year[i] += year[i - 1];

            if(maxYear < year[i]){

                maxYear = year[i];
                maxNum = i + 1950;

            }


        }

        return maxNum;

    }


}
