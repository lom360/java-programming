package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        // Loop will exit if -1 is entered.
        while(true) {
            int num = Integer.parseInt(reader.readLine());
            sum = sum + num;
            if(num == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}
