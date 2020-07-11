package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Stark", 0);
        map.put("Targaryen", 500000);
        map.put("Lanister", 1000000);
        map.put("Tyrell", 1000000);
        map.put("Baratheon", 250000);
        map.put("Frey", 2);
        map.put("Name", 0);
        map.put("Kazark", 5);
        map.put("Bolton", 1000);
        map.put("Vale", 50000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);

        for(Map.Entry<String, Integer> pair : copy.entrySet()) {
            if(pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}