package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,23,34,11,54};

        int target = 54;
        int answer = LinearSearch3(arr, target);
        System.out.println(answer);


    }

    //Return true or false
    static boolean LinearSearch1(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for(int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }

    // search the target and return the element
    static int LinearSearch2(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element :arr){
            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i =0; i <arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
