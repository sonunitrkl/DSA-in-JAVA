package com.pranil.academy.recursion.warmup;

import java.util.Scanner;

public class QuickSortCode {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int [] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int [] arr ={5,2,3,1};
        quickSort(arr,0, arr.length-1);
        for (int ele : arr){
            System.out.println(ele +" ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >=end ) {
            return;
        }
        int pivot = arr[start];
        int partitionInex = partition(arr, start, end );
        quickSort(arr,start, partitionInex-1);
        quickSort(arr, partitionInex+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int count =0;
        int pivot = arr[start];
        for(int i=start+1;i<=end; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int temp = arr[start+count];
        arr[start+count]=pivot;
        arr[start] = temp;
        int i=start;
        int j= end;
        while(i <start+count && j> start+count){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else{
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        return start+count;
    }

}
