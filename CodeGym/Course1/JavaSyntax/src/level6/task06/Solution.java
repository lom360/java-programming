package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        int remainder = 0;

        while(num != 0) {
            remainder = num % 10; // Stores the value of the last digit.

            if(remainder % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            num = num / 10; // Gets rid of the last digit.
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
