package com.codegym.task.task09.task0919;

/* 
Dividing by zero
Create a public static void divideByZero method that divides any number by zero, and display the result of the division.
Wrap the divideByZero method call in a try-catch block. Display the exception stack trace using the exception.printStackTrace() method.

Requirements:
1. The class must have a public static void divideByZero method.
2. The divideByZero method must contain a divide-by-zero operation.
3. The divideByZero method should call System.out.println or System.out.print.
4. The main method must have a try-catch block.
5. The main method should catch any exceptions thrown by the divideByZero method.
6. The program should display the stack trace of the caught exception.
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int solution = 100 / 0;
        System.out.println(solution);
    }
}
