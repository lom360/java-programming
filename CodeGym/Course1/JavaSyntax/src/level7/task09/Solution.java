package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int shortestString = strings.get(0).length(); // Start with first item in array.
        for(int i = 1; i < strings.size(); i++) {
            if(shortestString > strings.get(i).length()) {
                shortestString = strings.get(i).length();
            }
        }

        for(int i = 0; i < strings.size(); i++) {
            if(shortestString == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
