package practice.assignment.assignment5.easy;

import java.util.ArrayList;
import java.util.Collections;

public class Q18_AddArrayForm {
    public static void main(String[] args) {


        int[] arr = {1,2,0,0};
        int k = 34;

        ArrayList<Integer> list = addTOArrayForm(arr, k);

        System.out.println(list);

    }

    private static ArrayList<Integer> addTOArrayForm(int[] arr, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;

        int num = 0;

        while(i < arr.length){

            num = num * 10 + arr[i];
            i++;

        }

        num = num + k;

        while(num != 0){

            int digit = num % 10;
            list.add(digit);

            num /= 10;

        }
        Collections.reverse(list);
        return list;

    }


    // 2nd way //
//    public List<Integer> addToArrayForm(int[] A, int K) {
//        int N = A.length;
//        int cur = K;
//        List<Integer> ans = new ArrayList();
//
//        int i = N;
//        while (--i >= 0 || cur > 0) {
//            if (i >= 0)
//                cur += A[i];
//            ans.add(cur % 10);
//            cur /= 10;
//        }
//
//        Collections.reverse(ans);
//        return ans;
//    }

    //3rd way //
//    public List<Integer> addToArrayForm(int[] A, int K) {
//        List<Integer> res = new LinkedList<>();
//        for (int i = A.length - 1; i >= 0; --i) {
//            res.add(0, (A[i] + K) % 10);
//            K = (A[i] + K) / 10;
//        }
//        while (K > 0) {
//            res.add(0, K % 10);
//            K /= 10;
//        }
//        return res;
//    }

    // 4th way


}
