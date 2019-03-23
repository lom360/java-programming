package com.codegym.task.task03.task0308;

/* 
Product of 10 numbers

*/

public class Solution {
    public static void main(String[] args) {
        int product = 1;

        for(int i = 10; i > 0; i--) {
            product = product * i;
        }

        System.out.println(product);
    }
}
