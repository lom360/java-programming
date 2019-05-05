package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for(int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }


        for(int i = 0; i < bigArr.length; i++) {
            if(i < 10) {
                smallArr1[i] = bigArr[i];
            }
            else {
                smallArr2[i - 10] = bigArr[i]; // Minus 10 to index since so it can start at 0.
            }
        }

        for(int i = 0; i < smallArr2.length; i++) {
            System.out.println(smallArr2[i]);
        }
    }
}
