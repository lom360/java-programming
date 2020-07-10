package com.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms
Task: read 30 numbers from the keyboard. Display the 10th and 11th smallest numbers.
Explanation:
The lowest number is the 1st smallest.
The next lowest after that is the 2nd smallest

For example:
1 6 5 7 1 15 63 88
The first smallest is 1
The second smallest is 1
The third smallest is 5
The fourth smallest is 6

Requirements:
1. The program must read data from the keyboard.
2. The program should display text on the screen.
3. The Solution class must have two methods.
4. The sort() method must sort an array of elements.
5. The main() method should call the sort() method.
6. The program should display the 10th and 11th smallest numbers. Each value should be on a new line.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //write your code here
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
