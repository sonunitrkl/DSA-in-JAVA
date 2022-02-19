package com.ninjas.world.recursion.phonekeypad;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
public class ReturnKeypadCombinations {
    static String [] codes = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};

    public static void main(String[] args) {
        String digits = "2773";
        List<String> data = returnList(digits);
        System.out.println(data);
    }

    private static List<String> returnList(String digits) {
        if(digits.length() == 0){
            List<String> data = new ArrayList<>();
            data.add("");
            return data;
        }
        int startDigit = digits.charAt(0)- '0';
        String code = codes[startDigit];
        List<String> data = returnList(digits.substring(1));
        List<String> ans = new ArrayList<>();
        for(int i=0 ;i<code.length(); i++){
            for(String ele : data){
                ans.add(code.charAt(i) + ele);
            }
        }
        return ans;
    }

}
