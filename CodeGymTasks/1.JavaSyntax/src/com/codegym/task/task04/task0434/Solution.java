package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int num = 1;
        int multiplier = 1; // Will be used to mulitple num.

        while(multiplier < 11) {
            System.out.print(num * multiplier);

            if(num == 10) {
                System.out.println(); // Moves to new line when 10 numbers are printed.
                num = 1; // Reset to allow multiplier to multiple numbers from 1-10 again.
                multiplier++; // Once multiplier has been used 10 times it will increment.
            }
            else {
                System.out.print(" ");
                num++; // Will contain any one number of 1-10.
            }
    }
}
