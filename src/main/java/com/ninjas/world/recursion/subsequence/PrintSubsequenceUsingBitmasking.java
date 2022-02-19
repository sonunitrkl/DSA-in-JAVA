package com.ninjas.world.recursion.subsequence;

public class PrintSubsequenceUsingBitmasking {
    public static void main(String[] args) {
        String str="abc";
        printSubsequence2(str);
    }
    private static void printSubsequence2(String str) {
        for(int i=0;i<=Math.pow(2,str.length())-1;i++){
            int count =0;
            int n= i;
            while(n>0){
                if((n & 1) ==1){
                    System.out.print(str.charAt(count));
                }
                count++;
                n = n>>1;
            }
            System.out.println();
        }
    }
}
