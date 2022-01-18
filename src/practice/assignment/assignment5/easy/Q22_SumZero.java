package practice.assignment.assignment5.easy;

import java.util.Arrays;

public class Q22_SumZero {

    public static void main(String[] args) {
        int n = 5;

        int[] res = sumZero(n);

        System.out.println(Arrays.toString(res));

    }

    private static int[] sumZero(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = i * 2 - n + 1;

        }

        return arr;

    }

}


//Actually, this rule could be derived from constructing an arithmetic sequence.
//
//        (Note that any arithmetic sequence must have unique values if the common delta is non-zero)
//
//        We need the sequence sum, so that
//
//        (a[0] + a[n-1]) * n / 2 = 0, which means a[0] + a[n-1] = 0.
//
//        Note that a[n-1] - a[0] = (n-1) * delta, which is -2 * a[0],
//
//        so we simply set delta = 2, a[0] = 1 - n


//    public int[] sumZero(int n) {
//        int[] res = new int[n];
//        int left = 0, right = n - 1, start = 1;
//        while (left < right) {
//            res[left++] = start;
//            res[right--] = -start;
//            start++;
//        }
//        return res;
//    }