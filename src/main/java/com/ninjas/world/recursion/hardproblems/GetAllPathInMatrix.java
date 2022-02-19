package com.ninjas.world.recursion.hardproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAllPathInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> res=getPath(1,1,n,m);
        System.out.println(res);
    }

    private static ArrayList<String> getPath(int i, int j, int n, int m) {
        if(i>n || j>m){
            ArrayList<String> ans=new ArrayList<>();
            return ans;
        }
        if(i==n && j==m){
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> hpath=new ArrayList<>();
        ArrayList<String> vpath=new ArrayList<>();
       if(i<n){
           vpath=getPath(i+1,j,n,m);
    }
     if(j<m){
       hpath=getPath(i,j+1,n,m);
   }
        ArrayList<String> ans=new ArrayList<>();

        for(String st: hpath){
            ans.add("h"+st);
        }
        for(String St: vpath){
            ans.add("v"+St);
        }
        return ans;
     }


}
