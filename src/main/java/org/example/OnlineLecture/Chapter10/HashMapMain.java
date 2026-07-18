package org.example.OnlineLecture.Chapter10;

import java.util.*;

public class HashMapMain {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,1,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }

        System.out.println(map);


        // Another way with 2 for loop

//
//        int[] arr = {1,2,3,1,2,1,2};
//
//        for(int i = 0; i < arr.length; i++) {
//
//            int count = 0;
//
//            for(int j = 0; j < arr.length; j++) {
//
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//
//            }
//
//            System.out.println(arr[i] + " -> " + count);
//
//        }




        // Instructor Solution

//        import java.util.*;
//
//        public class Main {
//
//            public static HashMap<Integer, Integer> getFrequencyMap(int[] arr) {
//
//                HashMap<Integer, Integer> fm = new HashMap<>();
//
//                for (int i = 0; i < arr.length; i++) {
//
//                    // Check if element already exists
//                    if (fm.containsKey(arr[i])) {
//
//                        int old = fm.get(arr[i]);
//
//                        fm.put(arr[i], old + 1);
//
//                    }
//
//                    // If element doesn't exist
//                    else {
//
//                        fm.put(arr[i], 1);
//
//                    }
//                }
//
//                return fm;
//            }
//
//            public static void main(String[] args) {
//
//                int[] arr = {1, 2, 3, 1, 2, 1, 2};
//
//                HashMap<Integer, Integer> ans = getFrequencyMap(arr);
//
//                System.out.println(ans);
//            }
//        }


    }
}