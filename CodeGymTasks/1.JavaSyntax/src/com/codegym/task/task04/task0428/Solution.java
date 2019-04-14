package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        //Note the point of this assignment is to practice logic operators.
        //But I am more concerned with practicing loops.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrList = new int[3];

        int posiCount = 0; // Positive Count
        for(int i = 0; i < arrList.length; i++) {
            arrList[i] = Integer.parseInt(reader.readLine());
            if(arrList[i] > 0) {
                posiCount++;
            }
        }
        System.out.println(posiCount);
    }
}
