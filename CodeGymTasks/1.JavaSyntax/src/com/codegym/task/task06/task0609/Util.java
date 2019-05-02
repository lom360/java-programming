package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        double a = x2 - x1;
        double b = y2 - y1;

        a = Math.pow(a,2);
        b = Math.pow(b,2);

        return Math.sqrt((a + b));
    }

    public static void main(String[] args) {

    }
}
