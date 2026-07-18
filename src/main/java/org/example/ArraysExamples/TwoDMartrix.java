package org.example.ArraysExamples;

import java.util.Scanner;

public class TwoDMartrix {

    public static void main(String[] args) {


        // Input in array matrix
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[] [] arr = new int[rows] [cols];

        for ( int i = 0; i < arr.length; i++) {

            // arr[i]  --> child array
            for ( int j = 0; j < arr[i].length; j++) {
                arr[i] [j] = sc.nextInt();
            }
        }
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr){

        for ( int i = 0; i<arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
