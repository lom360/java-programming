package com.codegym.task.task12.task1202;

/* 
Whales, the descendants of cows
Override the getName method in the Whale class so that the program doesn't display anything on the screen.

Requirements:
1. The program should not display text on the screen.
2. The Whale class must inherit the Cow class.
3. The Whale class must override the getName() method.
4. The main() method must call the Cow object's getName() method.
5. Implement the Whale class's getName() method so that the program doesn't display anything on the screen.
6. The main() method should display the result of calling the getName() method.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm a cow";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "";
        }
    }
}
