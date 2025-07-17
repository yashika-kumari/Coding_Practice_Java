package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        int product = x * y;
        System.out.println("Product: " + product);
        int hour12 = product % 12;
        if (hour12 == 0) {
            hour12 = 12;
        }


        System.out.println("Result: " + hour12);
        sc.close();
    }
}
