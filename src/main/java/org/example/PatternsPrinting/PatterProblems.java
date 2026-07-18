package org.example.PatternsPrinting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatterProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // *
        // **
        // ***
        // ****
        // *****

        // for ( int i = 1; i <= n; i++) {
        //   for (int j = 1; j <= i; j++) {
        //     System.out.print("*");
        //   }
        //    System.out.println();
        // }
        // System.out.println();

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for ( int i = 1; i <= n ; i++) {

        //   int end = i;
        //   for ( int j = 1; j <= end; j++) {
        //     System.out.print(j + " ");
        //   }
        //   System.out.println();
        // }

        // for ( int i = n; i >= )


        // *****
        // ****
        // ***
        // **
        // *
        // for ( int row = 1; row <= n; row++ ){

        //   int stars = n-row+1;
        //   for(int i = 1; i <= stars; i++) {
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }
        // System.out.println();

        // Method 2

//        *****
//        ****
//        ***
//        **
//        *

//        for ( int row = n; row >= 1; row--) {
//            int stars = row;
//
//            for ( int i = 1; i <= stars; i++){
//
//                System.out.print("*");
//            }
//            System.out.println();


//            for ( int row = 1; row <= n; row++) {
//
//                System.out.print("*");
//                int spaces = n-2;
//                for ( int i = 1; i <= spaces; i++ ) {
//                    System.out.print(" ");
//                }
//                System.out.println("*");
//            }
//        System.out.println();




        //
//        // *
//          ***
//         *****
//        *******

//        int stars = 1;
//        for ( int row = 1; row <= n; row++) {
//            int spaces = n-row;
//
//            for ( int i = 1; i<= spaces; i++ ) {
//                System.out.print(" ");
//            }
//
//            for ( int i = 1; i <= stars; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//            stars = stars + 2;
//        }



//
//        ********
//        ***  ***
//        **    **
//        *      *

//        int spaces = 0;
//        for ( int row = n; row >= 1; row--){
//
//            int stars = row;
//            for ( int i = 1; i <= stars; i++){
//                System.out.print("*");
//            }
//            for ( int  i = 1; i <= spaces; i++){
//                System.out.print(" ");
//            }
//            for ( int i = 1; i <= stars; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//            spaces = spaces + 2;
//        }


        int spaces = n*2-2;
        for ( int row = 1; row <= n; row++){

            int stars = row;
            for ( int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            for ( int  i = 1; i <= spaces; i++){
                System.out.print(" ");
            }
            for ( int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            System.out.println();
            spaces = spaces - 2;
        }

    }
}
