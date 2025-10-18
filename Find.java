package com.company;
//Find an element or if it exists in the array using recursion
public class Find {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,12,43,56};
        System.out.println(exist(arr, 0, 43));
    }

    static boolean exist(int[] arr, int i, int target){
        if (i == arr.length - 1){
            return false;
        }
        return arr[i] == target || exist(arr, i + 1, target);
    }
}
