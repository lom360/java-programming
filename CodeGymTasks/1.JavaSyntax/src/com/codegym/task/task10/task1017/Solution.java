package com.codegym.task.task10.task1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Safe retrieval from a list
Create a list of integers.
Enter 20 integers from the keyboard.
Create a method to safely retrieve numbers from the list:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
The method must return a list item based on its index.
If an exception occurs while retrieving an element, it must be caught, and the method should return defaultValue.

Requirements:
1. The program should read 20 numbers from the keyboard.
2. The program should display data on the screen.
3. The safeGetElement method must return a list item based on its index, unless exceptions occur in the method.
4. The safeGetElement method must return defaultValue if exceptions occur in the method. Catch exceptions.
5. The safeGetElement method must not throw exceptions.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //write your code here
        try {
            return list.get(index);
        }
        catch (Exception e) {
            return defaultValue;
        }
    }

}
