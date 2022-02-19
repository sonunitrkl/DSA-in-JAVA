package com.ninjas.world.recursion.hardproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetStairCasePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<String> allPath = getAllPath(n);
        allPath.forEach(System.out::println);
    }

    private static List<String> getAllPath(int n) {
        if (n == 0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        if (n < 0) {
            List<String> ans = new ArrayList<>();
            return ans;
        }
        List<String> ans1 = getAllPath(n - 1);
        List<String> ans2 = getAllPath(n - 2);
        List<String> ans3 = getAllPath(n - 3);
        List<String> ans = new ArrayList<>();
        for (String ele : ans1) {
            ans.add("1" + ele);
        }
        for (String ele : ans2) {
            ans.add("2" + ele);
        }
        for (String ele : ans3) {
            ans.add("3" + ele);
        }
        return ans;
    }
}
