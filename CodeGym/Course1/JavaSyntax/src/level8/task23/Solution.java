package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here
        // We will always need to capitalize the first letter.
        // So start right away before going into the loop.
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') { //
                // 1) The first substring adds the string from index 0 up to but not including i.
                // 2) The second substring adds the string from index i and capitalize it.
                // 3) The third substring adds the rest of the string after index i.
                s = s.substring(0, i) + s.substring(i, i + 1).toUpperCase() + s.substring(i + 1);
            }
        }

        System.out.print(s);
    }
}
