package com.ninjas.world;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        System.out.println(sumOfSubstrings(num));
    }

    public static long sumOfSubstrings(String num) {
        long sum = 0;
        long multiplingFactor = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            sum += (num.charAt(i) - '0') * (i + 1) * multiplingFactor;
            multiplingFactor = multiplingFactor * 10 + 1;
        }
        return sum;
    }

    public static long sumSubstrings(String s) {
        //Your code here
        int n = s.length();
        long[] dp = new long[n];
        long m = 1000000007;
        dp[0] = ((long) s.charAt(0)) - 48;
        for (int j = 1; j < n; j++)
            dp[j] = (dp[j - 1] * 10 + (j + 1) * (((long) s.charAt(j)) - 48)) % m;

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + dp[i]) % m;
        }
        return sum;
    }
}
