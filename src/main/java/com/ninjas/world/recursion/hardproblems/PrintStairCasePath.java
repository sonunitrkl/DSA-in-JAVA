package com.ninjas.world.recursion.hardproblems;

import java.util.Scanner;

public class PrintStairCasePath {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        printPaths(n,"");
    }

    private static void printPaths(int n, String currPath) {
        if(n<0) return;

        if(n==0){
            System.out.println(currPath);
            return;
        }
        printPaths(n-1, "1" +currPath);
        printPaths(n-2, "2" +currPath);
        printPaths(n-3, "3" +currPath);
    }
}
