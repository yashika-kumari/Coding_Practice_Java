package com.company;

public class FIndMin {
    public static void main(String[] args) {
        int[] arr = {24,12,3,76,12};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
