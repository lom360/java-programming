package com.codegym.task.task12.task1215;

/* 
Cats should not be abstract!
Make the Cat and Dog classes inherit Pet.
Implement the missing methods.
The Cat and Dog classes should not be abstract.

Requirements:
1. The Pet class must be abstract.
2. The Dog class must not be abstract.
3. The Cat class must not be abstract.
4. The Dog class must implement the Pet class's abstract methods.
5. The Cat class must implement the Pet class's abstract methods.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public class Cat extends Pet{
        public String getName() {
            return "Felix";
        }

        public Pet getChild() {
            Cat cat = new Cat();
            return cat;
        }
    }

    public class Dog extends Pet{
        public String getName() {
            return "Max";
        }

        public Pet getChild() {
            Dog dog = new Dog();
            return dog;
        }
    }

}
