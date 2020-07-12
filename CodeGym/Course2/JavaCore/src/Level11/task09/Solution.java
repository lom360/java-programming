package com.codegym.task.task11.task1109;

/* 
Like cats and dogs
Make all of the internal variables of the Cat and Dog classes private.
Also, make all of the methods private, except those that allow these two classes to interact with each other.

Requirements:
1. The Cat class's variables must be private.
2. The Dog class's variables must be private.
3. The Cat class's methods must be private.
4. The Dog class's methods must be private.
5. Methods that let the Cat and Dog classes interact with each other must be public.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Oscar", 5);
        Dog dog = new Dog("Rover", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}



