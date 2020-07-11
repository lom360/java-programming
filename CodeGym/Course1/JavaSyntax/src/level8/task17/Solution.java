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
        map.put("Targaryen", "Daenerys");
        map.put("Stark", "Arya");
        map.put("Greyjoy", "Theon");
        map.put("Baratheon", "Robert");
        map.put("Mormont", "Lyanna");
        map.put("Finger", "Little");
        map.put("Hound", "The");
        map.put("One", "No");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        boolean hasDuplicate = false; // Turn true if we find at least one duplicate.
        String s = itr.next().getValue(); // Copy next iteration.

        // Cannot update list if iterating through list.
        while(itr.hasNext()) {
            if(s.equals(itr.next().getValue())) { // Turn our boolean value true when it finds duplicate.
                hasDuplicate = true;
                break; // Only need to check if there is at least one duplicate.
            }
        }

        if(hasDuplicate) { // Will only run if true.
            removeItemFromMapByValue(map, s); // This function will get rid of all values that has duplicates. Literally all.
            removeFirstNameDuplicates(map); // Use recursion to repeat the function with update list.
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
