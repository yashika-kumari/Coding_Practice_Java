package com.company;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int weight = sc.nextInt();
        if (age> 18 && weight >50){
            System.out.println("Eligible to donate blood!");
        }else{
            System.out.println("Not eligible to donate blood!");
        }
    }
}
