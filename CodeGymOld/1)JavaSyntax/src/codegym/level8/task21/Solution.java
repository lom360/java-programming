package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Stark", "Sansa");
        map.put("Targaryen", "Dany");
        map.put("Stark", "Arya");
        map.put("No Name", "Dany");
        map.put("Snow", "Jon");
        map.put("Lanister", "Tyrion");
        map.put("Baratheon", "Robert");
        map.put("Tyrell", "What's her face");
        map.put("Something", "Nothing");
        map.put("Bob", "Sponge");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
