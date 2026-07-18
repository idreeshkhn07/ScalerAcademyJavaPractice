package org.example.Chapter1BasicInputOutput.Chapter2;

import java.util.Scanner;

public class ChapterTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        // is even or odd
//        if ( n % 2 == 0) {
//            System.out.println(n + " is even");
//        } else {
//            System.out.println(n + " is odd");
//        }
//
        // Last digit of number

        System.out.println(n % 10);


    }
}
