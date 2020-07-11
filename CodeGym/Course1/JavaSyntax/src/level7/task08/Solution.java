package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings = new ArrayList<String>() {
    };

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int longestString = strings.get(0).length(); // Start with first item in array.
        for(int i = 1; i < strings.size(); i++) {
            if(longestString < strings.get(i).length()) {
                longestString = strings.get(i).length();
            }
        }

        for(int i = 0; i < strings.size(); i++) {
            if(longestString == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
