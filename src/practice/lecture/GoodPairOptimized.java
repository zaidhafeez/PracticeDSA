package practice.lecture;

public class GoodPairOptimized {

    public static void main(String[] args) {

        int[] count = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(count));




    }

    static int numIdenticalPairs(int[] A) {
        int res = 0, counts[] = new int[101];
        for (int a: A) {
            res += counts[a]++;
        }
        return res;
    }

}
