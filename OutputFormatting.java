package com.company;
import java.util.Scanner;
public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            for (int j = s1.length(); j <15 ; j++) {
                s1+=" ";

            }
            System.out.print(s1);
            int digits;
            if (x == 0){
                digits = 1;
            }else{
                digits = ((int) Math.log(x)) + 1;
            }
            int zeroesToAdd = 3 - digits;
            for (int l = 0; l < zeroesToAdd; l++) {
                System.out.print(0);
            }
            System.out.print(x);
            System.out.println();
        }
        System.out.println("================================");



    }
}
