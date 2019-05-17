package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Snow", "Jon");
        map.put("Lanister", "Cersei");
        map.put("Targaryen", "Danearyus");
        map.put("Stark", "Arya");
        map.put("Greyjoy", "Theon");
        map.put("Baratheon", "Robert");
        map.put("Mormont", "Jariah");
        map.put("Finger", "Little");
        map.put("Hound", "Bob");
        map.put("Names", "Bob");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            String s = itr.next().getValue();
            removeItemFromMapByValue(map, s);
            
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
