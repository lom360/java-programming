package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("The triangle is possible.");
        }
        else {
            System.out.println("The triangle is not possible.");
        }
    }
}