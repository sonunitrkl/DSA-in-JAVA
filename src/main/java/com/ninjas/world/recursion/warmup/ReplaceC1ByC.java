package com.ninjas.world.recursion.warmup;

import java.util.Scanner;

public class ReplaceC1ByC {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(ReplaceC1ByC.replaceCharacter(input, c1, c2));

    }
    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() ==0) return "";
        char c = input.charAt(0) == c1 ?c2: input.charAt(0);
        return c + replaceCharacter( input.substring(1),  c1,  c2);
    }
}
