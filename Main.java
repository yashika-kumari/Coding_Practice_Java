package com.company;
/* Profit Calculation for The Herald Newspaper
Every Saturday, The Herald, a local newspaper vendor, publishes a special edition of his newspaper. As part of his business strategy, he sells multiple copies of this special edition to his loyal customers. Each Saturday, he needs to assess the profit he makes from selling these newspapers to ensure that his operations remain financially viable.

The Herald sells 'a' copies of the newspaper for 'b' rupees per copy, but he has costs associated with printing each newspaper, which is 'c' rupees. Additionally, he incurs a fixed overhead cost of Rs. 100 each Saturday for storage, delivery, and other operational expenses.

To keep track of his financial health, The Herald wants to calculate the profit he earns from selling these newspapers every Saturday. He needs a program that takes the number of copies sold, the selling price per copy, and the cost to print each copy, and calculates the total profit.

The program will compute:

The total revenue generated from selling 'a' copies of the newspaper.
The total cost incurred from printing 'a' copies and the fixed costs.
The profit obtained by subtracting the total costs from total revenue.


Input Format

The program receives three integers:

a: Number of copies sold (in integer).
b: Cost per copy (in integer).
c: Cost spent per copy (in integer).


Output Format

The output consists of a single integer which represents the profit obtained by The Herald.



Sample Input

1000

2

1



Sample Output

900



Explanation

The Herald sells 1000 copies.

Each copy is sold for 2 rupees.

The cost to print each copy is 1 rupee.

Total Revenue: Total Revenue = 1000 × 2 = 2000 rupees

Total Cost: Total Cost = (1000 × 1) + 100 = 1000 + 100 = 1100 rupees

Profit: Profit = Total Revenue - Total Cost = 2000 - 1100 = 900 rupees */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // Number of copies sold
        b = sc.nextInt(); // Cost per copy
        c = sc.nextInt(); // Cost spent per copy
        int totalRevenue = a * b; // Total revenue from selling 'a' copies
        int totalCost = (a * c) + 100; // Total cost including printing and fixed costs
        int profit = totalRevenue - totalCost; // Profit calculation
        System.out.println(profit); // Output the profit
        sc.close(); // Close the scanner to prevent resource leaks

    }
}
