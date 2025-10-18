package com.company;

import java.util.Arrays;

public class BubbleRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,9,0};
        bubble(arr,arr.length -1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr,int r, int c){
        if (r == 0){
            return;
        }
        if ( c < r){
            if (arr[r] < arr[c]){
                swap(arr, r, c);
            }
            bubble(arr,r, c+1);
        }else{
            System.out.println();
            bubble(arr, r-1, 0);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
