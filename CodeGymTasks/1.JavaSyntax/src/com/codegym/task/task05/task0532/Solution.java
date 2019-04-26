package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //write your code here
        int N = Integer.parseInt(reader.readLine());
        while(N > 0) {
            int num = Integer.parseInt(reader.readLine());
            if(num > maximum) {
                maximum = num;
            }
            N--;
        }

        System.out.println(maximum);
    }
}
