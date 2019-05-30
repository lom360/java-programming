package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //write your code here
        // According to other students. We will learn why we call index 2 in the Multithreading Course.
        String methodName2 = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName2;
    }

    public static String method2() {
        method3();
        //write your code here
        String methodName3 = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName3;
    }

    public static String method3() {
        method4();
        //write your code here
        String methodName4 = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName4;
    }

    public static String method4() {
        method5();
        //write your code here
        String methodName5 = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName5;
    }

    public static String method5() {
        //write your code here
        String methodName6 = Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName6;
    }
}
