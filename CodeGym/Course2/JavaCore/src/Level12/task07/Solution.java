package com.codegym.task.task12.task1207;

/* 
int and Integer
Write the following two methods: print(int) and print(Integer).
In the main method, write code that calls both methods.

Requirements:
1. The Solution class must contain a static main() method.
2. The Solution class must contain a static void print() method with an int parameter.
3. The Solution class must contain a static void print() method with an Integer parameter.
4. The main() method must call the print() method that has an int parameter.
5. The main() method must call the print() method that has an Integer parameter.
*/

public class Solution {
    public static void main(String[] args) {
        print(0);
        print((Integer) 1); // Type Casting
    }

    //write your code here
    public static void print(int n) {
        System.out.println(n);
    }

    public static void print(Integer n) {
        System.out.println(n);
    }
}
