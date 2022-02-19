package com.ninjas.world.recursion.hardproblems;

public class PrintAllPathsWithJump {
    public static void main(String[] args) {
        printPathJump(1, 1, 3, 3, "");
    }

    private static void printPathJump(int sr, int sc, int dr, int dc, String path) {
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        for (int move = 1; move <= dc - sc; move++) {
            printPathJump(sr, sc + move, dr, dc, "h" + move + path);
        }
        for (int move = 1; move <= dr - sr; move++) {
            printPathJump(sr + move, sc, dr, dc, "v" + move + path);
        }
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            printPathJump(sr + move, sc + move, dr, dc, "d" + move + path);
        }
    }
}
