package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int shortest = list.get(0).length(); // Get length starting with first index.
        int longest = list.get(0).length();

        int firstShortestIndex = 0;
        int firstLongestIndex = 0; // These will store the indexes of the shortest or longest Strings.

        for(int i = 1; i < list.size(); i++) {
            if(shortest > list.get(i).length()) {
                shortest = list.get(i).length();
                firstShortestIndex = i;
            }

            if(longest < list.get(i).length()) {
                longest = list.get(i).length();
                firstLongestIndex = i;
            }
        }

        if(firstLongestIndex < firstShortestIndex) {
            System.out.println(list.get(firstLongestIndex));
        }
        else {
            System.out.println(list.get(firstShortestIndex));
        }
    }
}
