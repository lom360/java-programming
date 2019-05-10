package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        list.remove(2); // Index 2 is the 3rd element.

        for(int i = 0; i < list.size(); i++ ) {
            int index = list.size() - 1 - i; // This will allow us to start in reverse
            System.out.println(list.get(index));
        }
    }
}


