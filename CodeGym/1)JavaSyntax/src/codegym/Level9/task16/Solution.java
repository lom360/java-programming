package com.codegym.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Catching checked exceptions
In the handleExceptions method, handle all checked exceptions.
You need to display the checked exception that occurs.
You can only use one try-catch block.


Requirements:
1. The handleExceptions method must call method1.
2. The handleExceptions method must call method2.
3. The handleExceptions method must call method3.
4. The handleExceptions method must use only one try-catch block.
5. The handleExceptions method should catch and display all the exceptions that occur.
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
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
