package com.pranil.academy.recursion.hardproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        List<String> ans = permutation(str);
        System.out.println(ans);
    }

    private static List<String> permutation(String str) {
        if(str.length() == 0){
            List<String> perm= new ArrayList<>();
            perm.add("");
            return perm;
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            List<String> perm= permutation(str.substring(0,i) +str.substring(i+1));
            for (String ele : perm){
                ans.add(str.charAt(i) +ele);
            }
        }
        return ans;
    }
}
