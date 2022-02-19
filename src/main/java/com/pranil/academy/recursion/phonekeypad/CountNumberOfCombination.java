package com.pranil.academy.recursion.phonekeypad;

public class CountNumberOfCombination {
    static String[] codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        int N = 2773;
        System.out.println(getCount(N));
    }
    public static long getCount(int N) {
        if (N == 0) return 1;
        //String code = codes[N % 10];
        long count = getCount(N / 10);
        return count * codes[N % 10].length();

    }
}
