package com.company;

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 45623;
        int base = 10;
        System.out.println(digits(num,base));
    }
    public static int digits(int num, int base){
        return (int)(Math.log(num) / Math.log(base) + 1); // ( log(number)/log(base) + 1
    }
}
