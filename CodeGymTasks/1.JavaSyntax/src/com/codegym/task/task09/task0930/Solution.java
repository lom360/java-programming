package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Task about algorithms
Task: The user enters a list of words (and numbers) from the keyboard. The words are displayed in ascending order, the numbers in descending order.

Example input:
Cherry
1
Bob
3
Apple
22
0
Watermelon

Example output:
Apple
22
Bob
3
Cherry
1
0
Watermelon

Requirements:
1. The program must read data from the keyboard.
2. The program should display data on the screen.
3. The displayed words should be sorted in ascending order (using the provided isGreaterThan method).
4. The displayed numbers must be sorted in descending order.
5. The main method should use the sort method.
6. The sort() method should call the isGreaterThan() method.
7. The sort() method should call the isNumber() method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        for(int i = 0; i < array.length; i++) {
            if(isNumber(array[i])) {
                for(int j = i + 1; j < array.length; j++) {
                     if(isNumber(array[j])) {
                         if(array[j].length() > array[i].length()) {
                             swapIndexValue(array, i, j);
                         }
                         else if(array[j].length() == array[i].length()) {
                             int size = array[i].length();
                             if(isGreaterThan(array[j].substring(size - 1), array[i].substring(size - 1))) {
                                 swapIndexValue(array, i, j);
                             }
                         }
                    }
                }
            }
            else {
                for(int j = i + 1; j < array.length; j++) {
                    if(!isNumber(array[j]) && isGreaterThan(array[i], array[j])) {
                        swapIndexValue(array, i, j);
                    }
                }
            }
        }
    }

    // Swap the values of the indexes. I added this piece of code.
    public static void swapIndexValue(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
