package org.example.Chapter1BasicInputOutput;

import java.util.*;

public class ChapterOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int Age = sc.nextInt();

        System.out.println( a - b + " Difference");
        System.out.println( a + b + " Sum");
        System.out.println("Product is " + a * b);

        System.out.println("Idreesh age is " + Age);

        System.out.println(10 + 20 + "30");

        System.out.println("10" + 20 + 30);

        System.out.println(10 + "20" + 30);

    }

}


