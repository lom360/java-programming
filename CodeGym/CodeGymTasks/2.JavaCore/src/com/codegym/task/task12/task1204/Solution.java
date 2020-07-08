package com.codegym.task.task12.task1204;

/* 
Whether it's a bird or a lamp
Write a method which determines the class type of the object you pass into it, and then displays on the screen the corresponding message: Cat, Dog, Bird, and Lamp.

Requirements:
1. The program must display text on the screen.
2. Don't change the Cat class.
3. Don't change the Dog class.
4. Don't change the Bird class.
5. Don't change the Lamp class.
6. The printObjectType() method must display one of the following messages, depending on the object passed to it. For example, it should display "Lamp" for a Solution.Lamp object.
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //write your code here
        System.out.println(o.getClass().getSimpleName());
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
