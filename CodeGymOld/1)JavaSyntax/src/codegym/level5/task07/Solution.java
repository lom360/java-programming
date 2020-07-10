package com.codegym.task.task05.task0507;
import java.io.*;

/* 
Arithmetic mean

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num      = 0;
        int sum      = 0;
        int count    = 0;
        double avg   = 0;

        while(true) {
            num = Integer.parseInt(reader.readLine());

            if(num == -1) {
                break;
            }

            sum = sum + num;
            count++; // Increment the number a values read from keyboard.
        }

        avg = (double) sum/count; // double is placed there to make int to double conversion go smoothly.
        System.out.println(avg);
    }
}

