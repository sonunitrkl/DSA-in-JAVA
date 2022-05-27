package com.ninjas.world.hashmap.medium;

import java.util.Scanner;

/**
 * @author Sonu Kumar
 */
public class SmallestSubstringContainingOtherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(getSmallestSubstring(str1,str2));
    }

    private static String getSmallestSubstring(String str1, String str2) {
        int l1 = str1.length();
        int l2= str2.length();

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        if(l1 < l2) return "";

        int [] freqStr1 = new int[256];
        int [] freqStr2 = new int[256];
        for(int i=0;i< str2.length(); i++){
            freqStr2[str2.charAt(i)]++;
        }
        int count = 0;
        for(int j=0; j<str1.length(); j++){
            freqStr1[str1.charAt(j)]++;

            if(freqStr1[str1.charAt(j)] <= freqStr2[str1.charAt(j)]){
                count ++;
            }
            if(count == l2){ // encountered the first substring so try to minimize the length of the current substring
                while(freqStr1[str1.charAt(start)] > freqStr2[str1.charAt(start)] || freqStr2[str1.charAt(start)]==0){
                    if( freqStr1[str1.charAt(start)] > freqStr2[str1.charAt(start)] ){
                        freqStr1[str1.charAt(start)]--;   // if frequency is more, so reduce the frequency
                    }
                    start ++; // shrink the window size for freqStr2[str1.charAt(start)]==0 also
                }
                if (min_len > j-start +1 ) {
                    min_len = j-start +1;
                    start_index = start;
                }
            }
        }
        if(start_index == -1 ) return "";
        return str1.substring(start_index, start_index + min_len);
    }
}
