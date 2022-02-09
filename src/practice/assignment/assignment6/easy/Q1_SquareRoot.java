package practice.assignment.assignment6.easy;

public class Q1_SquareRoot {


    // using binary search
    static int sqrt(int n){

        if(n == 0) return 0;
        int start = 1;
        int end = n;
        int ans = 0;
        while(start <= end){

            int mid  = start + (end - start) / 2;
            if(mid <= n / mid){

                ans = mid;
                start = mid + 1;

            }
            else end = mid - 1;



        }
        return start;
    }


    // using newton raphson method //

    static int newtonSqrtt(int n){

        int x = n;

        while(x > n / x){

            x = (x + n / x) / 2;

        }

        return x;

    }




    public static void main(String[] args) {

        int n = 40;
        int ans = newtonSqrtt(n);
        System.out.println(ans);

    }


}
