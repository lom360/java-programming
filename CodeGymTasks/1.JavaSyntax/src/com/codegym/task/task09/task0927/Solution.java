package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats
There is a Cat class with a String variablename.
Create a Map<String, Cat> and add 10 cats represented by (name, Cat) pairs.
Get a Set of all cats from the Map and display it on the screen.

Requirements:
1. The program must not read data from the keyboard.
2. The createMap method must create a new HashMap<String, Cat> object.
3. The createMap method must add 10 cats to the map, represented by (name, Cat) pairs.
4. The createMap method must return the created map.
5. The convertMapToSet method must create and return the set of cats retrieved from the passed map.
6. The program should display all the cats in the set.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> cats = new HashMap<String, Cat>();

        cats.put("Sponge", new Cat("Sponge"));
        cats.put("Dark", new Cat("Dark"));
        cats.put("Light", new Cat("Light"));
        cats.put("Frontyard", new Cat("Frontyard"));
        cats.put("Backyard", new Cat("Backyard"));
        cats.put("Underwhite", new Cat("Underwhite"));
        cats.put("Mitski", new Cat("Mitski"));
        cats.put("Kauru", new Cat("Kauru"));
        cats.put("Something", new Cat("Something"));
        cats.put("Anything", new Cat("Anything"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> newSet = new HashSet<>(map.values());

        return newSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
