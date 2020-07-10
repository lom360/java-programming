package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arrList[] = new int[3];

        int posCount = 0; // Positive Count
        int negCount = 0; // Negative Count
        for(int i = 0; i < arrList.length; i++) {
            arrList[i] = Integer.parseInt(reader.readLine());
            if(arrList[i] > 0) {
                posCount++;
            }
            if(arrList[i] < 0) {
                negCount++;
            }
        }
        System.out.println("Number of negative numbers: " + negCount);
        System.out.println("Number of positive numbers: " + posCount);
    }
}
