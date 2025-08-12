package com.company;

public class Patterns {
    public static void main(String[] args) {
        Pattern5(3);
    }

    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();

        }
    }
    static void Pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
