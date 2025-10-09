package com.company;

public class DigitSumRecursion {
    public static void main(String[] args) {
        int ans = digitSum(1342);
        System.out.println(ans);
    }
    static int digitSum(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10); // n % 10 gives remainder and n/10 moves places
    }
}
