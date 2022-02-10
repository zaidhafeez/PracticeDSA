package revise;

public class Incremental {

    public static void main(String[] args){

        int i = 1;
        int n = 5;

        while(n > 0){
            i++;
//            System.out.println(i);
            n = n - i;
            System.out.println("n" + n);
        }

    }
}
