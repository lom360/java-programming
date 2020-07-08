package com.codegym.task.task12.task1214;

/* 
Cows are animals too
Make the Cow class inherit Animal.
Implement the Cow class's missing methods.

Requirements:
1. The Animal class must be abstract.
2. The Cow class must not be abstract.
3. The Cow class must inherit the Animal class.
4. The Cow class must implement the Animal class's abstract methods.
5. The Cow class's getName() method must return a good name for a cow.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Agent Moo";
        }
    }

}
