package com.pranil.academy.recursion.hardproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetAllPathMatrixByJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        ArrayList<String> res = getPath(1, 1, 3, 3);
        res.forEach(System.out::println);
        //System.out.println(res);
       // printMazePaths(0,0,3,3,"");
    }

    private static ArrayList<String> getPath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        ArrayList<String> paths = new ArrayList<>();

        // Horizontal
        for (int move = 1; move <= dc - sc; move++) {
            ArrayList<String> horiz = getPath(sr, sc + move, dr, dc);
            for (String path : horiz) {
                paths.add("h" + move + path);
            }
        }
        // Vertical
        for (int move = 1; move <= dr - sr; move++) {
            ArrayList<String> vert = getPath(sr + move, sc, dr, dc);
            for (String path : vert) {
                paths.add("v" + move + path);
            }
        }
        // digonal
        for (int move = 1; move <= dr - sr && move <= dc - sc; move++) {
            ArrayList<String> digonal = getPath(sr + move, sc + move, dr, dc);
            for (String path : digonal) {
                paths.add("d" + move + digonal);
            }
        }
        return paths;
    }

}
