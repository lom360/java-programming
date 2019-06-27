package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Vowels and consonants
Write a program that reads a string from the keyboard.
The program should display two lines:
1. The first line contains only the vowels from the entered string.
2. The second contains only the consonants and punctuation marks from the entered string.
The letters should be separated by a space, each line must end with a space.

Example input:
Sam I Am.

Example output:
a I A
S m m .


Requirements:
1. The program must read data from the keyboard.
2. The program should display two lines.
3. The first line should contain only the vowels from the input string, separated by a space.
4. The second line should contain only the consonants and punctuation marks from the input string, separated by a space.
5. Each line must end with a space.
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}