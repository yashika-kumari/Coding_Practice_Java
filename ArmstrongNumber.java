package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public  static int power(int base, int exp){
        int result = 1;
        for (int i = 0;i<exp;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum =0;
        int temp =num;
        int digits = String.valueOf(num).length();
        if (num<0){
            System.out.println("Please enter a non negative number!");
            return;
        }
        while(temp>0){
            int digit = temp % 10;
            sum = sum + power(digit,digits);
            temp = temp/10;
        }
        if(sum == original){
            System.out.printf("%d is an armstrong number",original);
            System.out.println();
        }else{
            System.out.printf("%d is not an armstrong number",original);
            System.out.println();
        }
        sc.close();
    }

}
