package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for(int i = 1; i < list.size(); i++) {
            // Started at index 1 to be able to conpare with index 0 using (i - 1).
            if(list.get(i).length() < list.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

