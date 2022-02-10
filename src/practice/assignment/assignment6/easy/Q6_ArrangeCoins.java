package practice.assignment.assignment6.easy;

public class Q6_ArrangeCoins {

    static int arrangeCoins(int noOfCoins){

        int start = 1;
        int end = noOfCoins;

        while(start <= end){

            int mid = start + (end - start) / 2;
            int coinFilled = mid * (mid + 1) / 2;

            if(coinFilled <= noOfCoins){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return start - 1;
        
    }
    
    public static void main(String[] args) {

        System.out.println(arrangeCoins(1));
        
    }
    
}
