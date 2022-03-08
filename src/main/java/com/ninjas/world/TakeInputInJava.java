package com.ninjas.world;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sonu Kumar
 */
public class TakeInputInJava {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // to take Integer input
        String data = br.readLine();              // to take the string input
        System.out.println(n);
        System.out.println(data);
    }
}
