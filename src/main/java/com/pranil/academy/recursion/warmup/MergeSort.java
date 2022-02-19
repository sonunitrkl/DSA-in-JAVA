package com.pranil.academy.recursion.warmup;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[] arr1 = new int[m];
        for(int i=0;i<m ;i++){
            arr1[i] = s.nextInt();
        }
        mergeSorted(arr1);
        for(int ele : arr1){
            System.out.print(ele + " ");
        }
    }

    private static void mergeSorted(int[] arr) {
        if(arr.length <=1){
            return;
        }
        int mid = arr.length /2;
        int[] part1 = new int[mid];
        int[] part2 = new int[arr.length - mid];
        for(int i=0;i<mid;i++){
            part1[i] = arr[i];
        }
        int k=0;
        for(int i=mid;i<arr.length;i++){
            part2[k++] = arr[i];
        }
        mergeSorted(part1);
        mergeSorted(part2);
        merge2Sorted(part1, part2, mid, arr.length - mid,arr );
    }

    private static void merge2Sorted(int[] arr1, int[] arr2, int m, int n, int [] ans) {
        int i=0;
        int j=0;
        int k=0;
       // int [] ans = new int[m+n];
        while(i<=m-1 && j<=n-1){
            if(arr1[i]<arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }
        while(i<m)  ans[k++] = arr1[i++];
        while(j<n)  ans[k++] = arr2[j++];
        //return ans;
    }
}
