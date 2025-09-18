package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num>0){
            int digit = num%10;
            reversed = reversed *10 +digit;
            num= num /10;
        }
        if(original == reversed){
            System.out.printf("%d is a palindrome",original);
            System.out.println();
        }else{
            System.out.printf("%d is not a palindrome",original);
            System.out.println();
        }
        sc.close();
    }
}


