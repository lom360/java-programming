package com.codegym.task.task08.task0825;

/* 
Mixed-up modifier

*/

public class Solution {
    public static int A = 5;  // static was moved to here.
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public void main(String[] args) { // static was moved from here.
    }

    public static int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

