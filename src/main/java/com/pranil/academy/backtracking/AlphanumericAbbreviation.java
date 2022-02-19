package com.pranil.academy.backtracking;

public class AlphanumericAbbreviation {
    public static void main(String[] args) {
        String str= "abc";
       // printSubsequence1(str,"");
       // printSubsequence2(str);
        printAbbreviation(str, "",0);
    }



    private static void printAbbreviation(String str, String output, int count) {
        if(str.length()==0){
            if(count == 0){
                System.out.println(output);
            }else {
                System.out.println(output + count);
            }
            return;
        }
        if(count > 0){
            printAbbreviation(str.substring(1),output + count + str.charAt(0),0);
        }else {
            printAbbreviation(str.substring(1),output + str.charAt(0),0);
        }
        printAbbreviation(str.substring(1),output,count +1);
    }
    private static void printSubsequence1(String str, String output) {
        if(str.length()==0){
            System.out.println(output);
            return;
        }
        printSubsequence1(str.substring(1), output);
        printSubsequence1(str.substring(1),output + str.charAt(0));
    }
}
