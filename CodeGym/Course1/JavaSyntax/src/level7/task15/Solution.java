package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sam");
        list.add("I");
        list.add("Am");

        for(int i = 0; i < list.size(); i += 2) { // Increment by 2 will skip "Ham"
            list.add(i + 1, "Ham");
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
