package com.ninjas.world.recursion.warmup;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class PowerXn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double recAns = myPow(x, n / 2);
        if (n < 0) {
            return 1 / myPow(x, -n);
        } else {
            if (n % 2 == 0) {
                return recAns * recAns;
            } else {
                return x * recAns * recAns;
            }
        }
    }
}
