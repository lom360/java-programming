package com.codegym.task.task12.task1210;

/* 
Three methods and a maximum
Write the following public static methods: int max(int, int), long max(long, long), double max(double, double).
Each method must return the maximum of the two numbers passed to it.

Requirements:
1. The program should not display text on the screen.
2. The Solution class must have four methods.
3. The Solution class must have a static int max(int, int) method.
4. The int max(int, int) method must return the maximum of two ints.
5. The Solution class must have a static long max(long, long) method.
6. The long max(long, long) method must return the maximum of two longs.
7. The Solution class must have a static double max(double, double) method.
8. The double max(double, double) method must return the maximum of two doubles.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //write your code here
    public static int max(int x, int y) {
        return x > y ? x : y; // used the ternary operator to simplify code.
    }

    public static long max(long x, long y) {
        return x > y ? x : y;
    }

    public static double max(double x, double y) {
        return x > y ? x : y;
    }
}
