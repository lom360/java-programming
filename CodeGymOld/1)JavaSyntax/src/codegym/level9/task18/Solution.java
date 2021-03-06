package com.codegym.task.task09.task0918;

/* 
We're all friends here, even the exceptions
There are four classes: MyException, MyException2, MyException3, and MyException4.
Inherit the classes so that you get any two checked exceptions and any two unchecked exceptions.
Hint:
Carefully study the Exception1, Exception2, and Exception3 classes from the second task in this lesson.


Requirements:
1. The Solution class must have 4 nested classes: MyException, MyException2, MyException3, and MyException4.
2. All the nested classes must inherit exception classes.
3. Two of the four classes must be checked exceptions.
4. Two of the four classes must be unchecked exceptions.
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends Exception{
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends MyException3{
    }
}

