package com.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Exception invasion
Populate the list exceptions with ten (10) different exceptions.
The first exception is already implemented in the initExceptions method.

Requirements:
1. The list exceptions must contain 10 elements.
2. All items in the list exceptions must be exceptions (descendants of the Throwable class).
3. All items in the list exceptions must be unique.
4. The initExceptions method must be static.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here

    }
}
