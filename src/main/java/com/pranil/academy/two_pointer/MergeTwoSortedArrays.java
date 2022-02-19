package com.pranil.academy.two_pointer;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i=0;i<m ;i++){
            arr1[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = s.nextInt();
        }
        int [] merge = merge2Sorted(arr1, arr2, m,n);
        for(int ele : merge){
            System.out.print(ele + " ");
        }
    }

    private static int[] merge2Sorted(int[] arr1, int[] arr2, int m, int n) {
        int i=0;
        int j=0;
        int k=0;
        int [] ans = new int[m+n];
        while(i<=m-1 && j<=n-1){
            if(arr1[i]<arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }
        while(i<m)  ans[k++] = arr1[i++];
        while(j<n)  ans[k++] = arr2[j++];
        return ans;
    }

}
