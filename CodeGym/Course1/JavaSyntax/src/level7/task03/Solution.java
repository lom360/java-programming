package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[10];
        int[] arrInt = new int[10];

        for(int i = 0; i < 10; i++) {
            arrStr[i] = reader.readLine();
            arrInt[i] = arrStr[i].length();
            System.out.println(arrInt[i]);
        }
    }
}
