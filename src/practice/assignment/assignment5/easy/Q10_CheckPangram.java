package practice.assignment.assignment5.easy;

public class Q10_CheckPangram {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelaydog";
        sentence.toLowerCase();
        System.out.println(checkIfPangram(sentence));

    }

    private static boolean checkIfPangram(String sentence) {

        boolean[] alphabets = new boolean[26];

        for(char c: sentence.toCharArray()) alphabets[c - 'a'] = true;
        for (boolean character : alphabets)  if(!character) return false;

        return true;

    }

}
