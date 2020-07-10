package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int arrList [] = new int[20];
        for(int i = 0; i < 20; i++) {
            arrList[i] = Integer.parseInt(reader.readLine());
        }

        maximum = arrList[0];
        minimum = arrList[0];
        for(int i = 1; i < arrList.length; i++) {
            if(maximum < arrList[i]) {
                maximum = arrList[i];
            }
            if(minimum > arrList[i]) {
                minimum = arrList[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
