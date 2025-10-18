package com.company;
// Find if the array is sorted or not using recursion
public class Sorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(SortedOrNot(arr,0));
    }

    static boolean SortedOrNot(int[] arr, int i) {
        // Base condition
        if (i == arr.length -1){
            return true;
        }
        return arr[i] < arr[i + 1] && SortedOrNot(arr, i+1);
    }

}
