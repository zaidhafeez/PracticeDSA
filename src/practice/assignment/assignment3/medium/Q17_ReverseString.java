package practice.assignment.assignment3.medium;

public class Q17_ReverseString {

    public static void main(String[] args) {

        String name = "Zaid";
        System.out.println(revString(name));

    }
    // we can also convert the string into chararray and then swap till string.length/2
    static String revString(String name) {

        String reverse = "";
        int start = 0;
        int end = name.length() - 1;
        while (start < name.length()){

            reverse += name.charAt(end);
            start++;
            end--;

        }

        return reverse;


    }

}
