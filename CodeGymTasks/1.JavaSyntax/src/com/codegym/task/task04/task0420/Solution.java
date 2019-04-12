package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrList = new int[3];

        arrList[0] = Integer.parseInt(reader.readLine());
        arrList[1] = Integer.parseInt(reader.readLine());
        arrList[2] = Integer.parseInt(reader.readLine());

        for(int i = 0; i < arrList.length; i++) {
            for(int j = i + 1; j < arrList.length; j++) {
                int temp = arrList[j];
                if(arrList[i] < arrList[j]) {
                    arrList[j] = arrList[i];
                    arrList[i] = temp;
                }
            }
            System.out.print(arrList[i] + " ");
        }
    }
}
