package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int longestString = 0;
        for(int i = 0; i < list.size(); i++) {
            if(longestString < list.get(i).length()) {
                longestString = list.get(i).length();
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(longestString == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
