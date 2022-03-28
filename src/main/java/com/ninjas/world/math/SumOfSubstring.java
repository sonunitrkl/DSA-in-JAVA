package com.ninjas.world.math;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class SumOfSubstring {
    static int N = 100000;
    static int[] prefixArray = new int[N];
    static int[] preComputedpowerOf10 = new int[N];
    static long MOD = (int)(1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(MOD);
        System.out.print(sumOfSubStrings(str));
    }

    public static void powerOf10() {
        preComputedpowerOf10[0] = 1;
        for (int i = 1; i < N; i++) {
            preComputedpowerOf10[i] = preComputedpowerOf10[i - 1] * 10;
        }
    }

//    public static void precomputePrefix(char[] str, int n) {
//        prefixArray[0] = str[0] - '0';
//        for (int i = 1; i < n; i++)
//            prefixArray[i] = (prefixArray[i - 1] + (str[i] - '0'))%MOD;
//    }

    public static long myPow(int x, int n) {
        if (n == 0) return 1;
        long recAns = myPow(x, n / 2)%MOD;
        if (n % 2 == 0) {
            return ((recAns%MOD) *(recAns%MOD))%MOD;
        } else {
            return ((x%MOD) *((recAns%MOD) *(recAns%MOD))%MOD)%MOD;
        }
    }

    public static long sumOfSubStrings(String str) {
        int n = str.length();
        powerOf10();
        //precomputePrefix(str.toCharArray(), n);
        long ans = 0, calc = 0, part1 = 0, part2 = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("first part :: "+ ((prefixArray[n - i - 2]%MOD) *(long) (i + 1)%MOD)%MOD);
            System.out.println("second part:: "+ (((((str.charAt(n - i - 1) - '0') * ((long)(n - i - 1)%MOD * (n - i)%MOD / 2)%MOD)%MOD)%MOD * myPow(10,i)%MOD))%MOD);
            calc = (((((prefixArray[n - i - 2]%MOD) * (i + 1)%MOD)%MOD + (str.charAt(n - i - 1) - '0') * ((long)(n - i - 1)%MOD * (n - i)%MOD / 2)%MOD)%MOD)%MOD * myPow(10,i)%MOD)%MOD;
            System.out.println("calc:: " + calc);
            ans = (ans%MOD + calc)%MOD;
        }
        return ans;
    }
}


