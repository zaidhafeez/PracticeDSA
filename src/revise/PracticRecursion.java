package revise;

public class PracticRecursion {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fcn(n));
    }

    private static int fcn(int number) {

        if(number < 1){

            return 1;

        }

        return fcn(number -1) + fcn(number - 2);


    }

}
