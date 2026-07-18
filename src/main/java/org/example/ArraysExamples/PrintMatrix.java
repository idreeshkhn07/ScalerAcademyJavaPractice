package org.example.ArraysExamples;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
//        int m = sc.nextInt();

        for ( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        printArray(arr);

        System.out.println(checkNonDecreasing(arr));
    }

//    public static void printArray(int[] arr){
//        for ( int i=0; i<arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }

    public static boolean checkNonDecreasing( int[] arr) {
        for ( int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
