package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while(true) {
            String sNum = reader.readLine();

            if(sNum.equals("sum")) {
                break;
            }

            sum = sum + Integer.parseInt(sNum);
        }

        System.out.println(sum);
    }
}
