package com.codegym.task.task14.task1420;

/* 
GCD
Greatest common divisor (GCD).
Enter 2 positive integers from the keyboard.
Display the greatest common divisor.

Requirements:
1. The program should read 2 lines from the keyboard.
2. If the entered lines can't be converted to positive integers, throw an exception.
3. The program should display data on the screen.
4. The program should display the greatest common divisor (GCD) of the numbers read from the keyboard and then terminate successfully.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input1 = 0;
        int input2 = 0;

        try {
            input1 = Integer.parseInt(reader.readLine());
            input2 = Integer.parseInt(reader.readLine());

            // The problem is asking for positive numbers.
            if(!CheckPositive(input1, input2)) {
                throw new Exception();
            }
        }
        catch(Exception e) {
            throw e;
        }

        System.out.println(GCD(input1, input2));
    }

    public static int GCD(int x, int y) {
        int remainder = x % y;
        if(remainder == 0) {
            return y;
        }
        else {
            return GCD(y, remainder);
        }
    }

    public static boolean CheckPositive(int x, int y) {
        if(x > 0 && y > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}


