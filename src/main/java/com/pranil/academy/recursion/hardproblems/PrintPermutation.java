package com.pranil.academy.recursion.hardproblems;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        printPermutation(str,"");
    }

    private static void printPermutation(String str, String output) {
        if(str.length()==0){
            System.out.println(output);
            return;
        }

    }
}
