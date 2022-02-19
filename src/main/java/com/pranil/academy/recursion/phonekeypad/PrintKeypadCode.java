package com.pranil.academy.recursion.phonekeypad;

import java.util.ArrayList;
import java.util.List;

public class PrintKeypadCode {
    static String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "2773";
        returnList(digits, "");
    }

    private static void returnList(String digits, String outPut) {
        if (digits.length() == 0) {
            System.out.println(outPut);
            return;
        }
        int startDigit = digits.charAt(0) - '0';
        String code = codes[startDigit];
        for (int i = 0; i < code.length(); i++) {
            returnList(digits.substring(1), code.charAt(i) + outPut);
        }
    }

}
