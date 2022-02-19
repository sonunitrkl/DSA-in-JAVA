package com.ninjas.world.recursion.warmup;

import java.util.Scanner;
/*
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
eg:  xpix  -----> x3.14x
eg:  pipi ------> 3.143.14
eg:  pip  ------> 3.14p
 */
public class Replacepi {
    public static void replacePi(String str, int start){
        if(str.length()<start){
            return;
        }

       if(str.charAt(start)=='p' && str.charAt(start+1)=='i'){
         String output= str.substring(0,start)+"3.14"+str.substring(start+2);
          replacePi(output,start+4);
       }
       else{
           replacePi(str,start+1);
       }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
            String str=scn.next();
         replacePi(str,0);
            System.out.println(str);
        }
}
