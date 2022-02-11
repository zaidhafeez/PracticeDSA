package practice.assignment.assignment6.easy;

public class Q07_NextGreatestLetter {


    public static char nextGreatestLetter(char[] letters, char target) {

        // this condition is put because at the end of list start will be 3 so at return it will give error so we
        // need to put this condition e.g ["c", "f", "j"] target = "j";

        if(target >= letters[letters.length - 1]) return letters[0];

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(letters[mid] <= target) start = mid + 1;
            else end = mid - 1;

        }

        return letters[start];


    }



    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'j';

        System.out.println(nextGreatestLetter(letters, target));

    }

}
