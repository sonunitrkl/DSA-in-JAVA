package com.pranil.academy.recursion.subset;

public class PrintSubsetRecursive {
    public static void main(String[] args) {

    }

    public static int countZerosRec(int input){
        // Write your code here
        if(input/10 == 0) return 0;
        if(input == 0) return 1;
        return input%10 ==0 ? countZerosRec(input) : countZerosRec(input) +1;

    }
}

