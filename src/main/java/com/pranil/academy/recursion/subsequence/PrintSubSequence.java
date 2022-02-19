package com.pranil.academy.recursion.subsequence;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printsubc(str);
    }
static void helper(String input, String output){
        if(input.length()==0){
            System.out.print(output+" ");
            return;
        }
        helper(input.substring(1),output);
        helper(input.substring(1),input.charAt(0)+output);
}
    private static void printsubc(String str) {
       helper(str,"");

    }
}
