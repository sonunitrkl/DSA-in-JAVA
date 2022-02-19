package com.ninjas.world.recursion.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAllPathStairCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> res=getAllPath(n);
        System.out.println(res);
    }

    private static ArrayList<String> getAllPath(int n) {
        if(n==0){
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }
        if(n<0){
            ArrayList<String> res=new ArrayList<>();
            return res;
        }
        ArrayList<String> path1=getAllPath(n-1);
        ArrayList<String> path2=getAllPath(n-2);
        ArrayList<String> path3=getAllPath(n-3);

        ArrayList<String> ans=new ArrayList<>();
        for(String st:path1){
            ans.add(1+st);
        }
        for(String st:path2){
            ans.add(2+st);
        }
        for(String st:path3){
            ans.add(3+st);
        }

        return ans;
    }
}
