package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oddGang  = 0;
        int evenGang = 0;

        int[] arr = new int[15];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

            if(i % 2 != 0) {
                oddGang = oddGang + arr[i];
            }
            else {
                evenGang = evenGang + arr[i];
            }
        }

        String msg = (oddGang > evenGang) ? "Odd-numbered houses have more residents." : "Even-numbered houses have more residents.";

        System.out.println(msg);
    }
}
