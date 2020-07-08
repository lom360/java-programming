package com.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    static String letterL = "L";
    static String letterE = "e";

    public static Set<String> createSet() {
        //write your code here
        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < 20; i++) {
            set.add(letterL);
            letterL += letterE;
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
