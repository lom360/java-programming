package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch
Write a program that will read numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
Wrap the code inside readData in a try-catch block.
If the user enters text instead of a number, then the method should catch an exception and then display all previously entered numbers.
Display each number on a new line in the same order it was entered.


Requirements:
1. The program must read data from the keyboard.
2. Don't change the main method.
3. The main method should not throw exceptions.
4. The readData method must contain a try-catch block.
5. If the user enters text rather than a number, the program should display all previously entered numbers.
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>();

            try{
                while(true) {
                    int num = Integer.parseInt(reader.readLine());
                    numbers.add(num);
                }
            }
            catch(Exception e) {
                for(int number : numbers) {
                    System.out.println(number);
                }
            }
    }
}
