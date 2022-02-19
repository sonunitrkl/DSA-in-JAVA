package com.ninjas.world.recursion.hardproblems;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        printPaths(1,1,3,3,"");
    }

    private static void printPaths(int sr, int sc, int dr, int dc, String path) {
        if(sr > dr || sc > dc) return;
        if(sr == dr && sc == dc){
            System.out.println(path);
            return;
        }
        printPaths(sr+1,sc,dr,dc, "h" +path);
        printPaths(sr,sc+1,dr,dc, "v" +path);
    }
}
