package com.pranil.academy.recursion.subsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> ans=getSubsequence(str);
        System.out.println(ans);
    }

    private static ArrayList<String> getSubsequence(String str) {
        if(str.length()==0){
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> ans=getSubsequence(str.substring(1));
        ArrayList<String> res=new ArrayList<>();
        for (String st:ans){
            res.add(""+st);
        }
        for (String st:ans){
            res.add(str.charAt(0)+st);
        }
        return res;
    }

}
