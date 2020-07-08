package com.codegym.task.task09.task0917;

/* 
Catching unchecked exceptions
In the handleExceptions method, handle all unchecked exceptions.
You need to use the printStack method to display the stack trace of
each exception that occurs.
You can only use one try-catch block.


Requirements:
1. The handleExceptions method must call method1.
2. The handleExceptions method must call method2.
3. The handleExceptions method must call method3.
4. The handleExceptions method must use only one try-catch block.
5. The handleExceptions method should catch all unchecked exceptions
   and use the printStack method to display the stack trace of each of them.
6. The program should display text.
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch(RuntimeException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

