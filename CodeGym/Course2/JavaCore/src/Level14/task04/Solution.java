package com.codegym.task.task14.task1404;

/* 
Cats
1. Read strings (parameters) from the console until the user enters an empty string (Enter).
2. Each parameter corresponds to the name of a cat.

For each parameter:
3. Create a Cat object equal to the cat from getCatByKey(String parameter).
4. Display the result of cat.toString().

Requirements:
1. The program must read data from the keyboard.
2. The program should stop reading data after an empty string is entered.
3. The program should display a description of each cat (cat.toString).
4. The program must use the getCatByKey method to create a Cat object for each cat name entered (each string read from the keyboard).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        CatFactory newCat = new CatFactory();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String catName = reader.readLine();

            if(catName.isEmpty()) break;

            Cat nCat = newCat.getCatByKey(catName);
            System.out.println(nCat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("boss".equals(key)) {
                cat = new MaleCat("Big Boy");
            } else if ("miss".equals(key)) {
                cat = new FemaleCat("Missy");
            } else if ("smudge".equals(key)) {
                cat = new FemaleCat("Smudgey");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a cat powerhouse named " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a cute kitty named " + getName();
        }
    }
}
