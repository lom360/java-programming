package com.codegym.task.task12.task1209;

/* 
Three methods and a minimum
Write the following public static methods: int min(int, int), long min(long, long), double min(double, double).
Each method must return the minimum of the two numbers passed to it.

Requirements:
1. The program should not display text on the screen.
2. The Solution class must have four methods.
3. The Solution class must have a static int min(int, int) method.
4. The int min(int, int) method must return the minimum of two ints.
5. The Solution class must have a static long min(long, long) method.
6. The long min(long, long) method must return the minimum of two longs.
7. The Solution class must have a static double min(double, double) method.
8. The double min(double, double) method must return the minimum of two doubles.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //write your code here
    public static int min(int x, int y) {
        return x < y ? x : y; // Used the ternary operator to simplify code.
    }

    public static long min(long x, long y) {
        return x < y ? x : y;
    }

    public static double min(double x, double y) {
        return x < y ? x : y;
    }
}
