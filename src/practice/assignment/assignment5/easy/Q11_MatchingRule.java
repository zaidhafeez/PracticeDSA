package practice.assignment.assignment5.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11_MatchingRule {

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
            Arrays.asList("phone","blue","pixel"),
            Arrays.asList("computer","silver","lenovo"),
            Arrays.asList("phone","gold","iphone"));


        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(list,ruleKey,ruleValue));


    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;

        for (int i = 0; i < items.size(); i++) {

            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
            if(ruleKey.equals("name") && items.get(i).get(0).equals(ruleValue)) count++;

        }

        return count;

    }


}
