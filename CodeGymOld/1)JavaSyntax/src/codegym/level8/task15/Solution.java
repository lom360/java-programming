package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<String,String>();
        String first = "Wayne";
        String last = "Bruce";

        for(int i = 0; i < 10; i++) {
            map.put(first, last);
            first += "Yo";
            last += "Lo";
        }

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count = 0;

        for(Map.Entry<String, String> itr : map.entrySet()) {
            if(name.equals(itr.getValue())) {
                count++;
            }
        }

        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int count = 0;

        for(Map.Entry<String, String> itr : map.entrySet()) {
            if(lastName.equals(itr.getKey())) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
