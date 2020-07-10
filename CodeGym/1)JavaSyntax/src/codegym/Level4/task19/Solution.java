package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] arrList = new int[4];

        arrList[0] = Integer.parseInt(reader.readLine());
        arrList[1] = Integer.parseInt(reader.readLine());
        arrList[2] = Integer.parseInt(reader.readLine());
        arrList[3] = Integer.parseInt(reader.readLine());

        int max = arrList[0];
        for(int i = 1; i < arrList.length; i++) {
            if(max < arrList[i]) {
                max = arrList[i];
            }
        }

        System.out.println(max);
    }
}
