package com.company;

public class Star {
    public static void main(String[] args) {
        int length = 6;
        for (int rows = 0; rows < length; rows++) {
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
