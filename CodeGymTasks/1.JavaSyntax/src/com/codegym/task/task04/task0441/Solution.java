package com.codegym.task.task04.task0441;


/* 
Somehow average

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

        // Insertion Sort
        for(int i = 1; i < arrList.length; i++) {
            int key = arrList[i];
            int j = 0;
            for(j = i - 1; j >= 0 && arrList[j] > key; j--) {
                arrList[j + 1] = arrList[j];
            }
            arrList[j + 1] = key;
        }

        System.out.println(arrList[1]);
    }
}
