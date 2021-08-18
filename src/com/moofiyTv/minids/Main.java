package com.moofiyTv.minids;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int x = 5; // 1  unit
        int y = 4; // 1
        System.out.println("Hello"); // 1
        // O(3)
        loop(4);
        loop(5);

        // udemy
        // skill share
        // DS -//

        



    }


   static void loop(int n){
       for (int i = 1; i <= n; i++) { // n
           System.out.println("subscribe"+i); //1*n
       }
     //  O(n+n);
     //  O(2n);
     //  O(n);
    }


}
