package com.ninjas.world.recursion.warmup;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        else return false;
    }
    public static  void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>=0){
            String str=s.next();
            System.out.println(isPalindrome(str));
            t--;
        }

    }

}
