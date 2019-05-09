package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }


        for(int i = 0; i < 13; i++) {
            int tail = list.size() - 1; // Index of last item of list
            String s = list.get(tail); // Storing a copy of String
            list.remove(tail);
            list.add(0, s);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
