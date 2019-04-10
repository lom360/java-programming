package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        int a_temp = abs(10 - a);
        int b_temp = abs(10 - b);

        if(a_temp < b_temp) { // The smaller the value the closer it is to 10.
            // We want to print out the actual argument passed.
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}