package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading
Overload the printMatrix method in 8 different ways. You should end up with 10 different printMatrix methods.

Requirements:
1. The Solution class must implement 10 printMatrix methods with different parameters.
2. The Solution class must be public.
3. All of the Solution class's methods must be static.
4. All of the Solution class's methods must be public.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, new Long(8));
        printMatrix(2, 3, new Character('8'));
        printMatrix(2, 3, new Short(8));
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Filling with integer values");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Long value) {
        System.out.println("Filling with long values");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Character value) {
        System.out.println("Filling with character values");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Filling with short values");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Filling with float values");
        printMatrix(m, n, (Object) value);
    }

    public static void printmatrix(int m, int n, Integer value) {
        System.out.println("Filling with Integer objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Filling with Double objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatix(int m, int n, Boolean value) {
        System.out.println("Filling with Boolean values");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
