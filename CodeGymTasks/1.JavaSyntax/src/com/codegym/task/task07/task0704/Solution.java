package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

