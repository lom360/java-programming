package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        int power1 = this.strength + this.weight + this.age;
        int power2 = anotherCat.strength + anotherCat.weight + anotherCat.age;
        return power1 > power2;
    }

    public static void main(String[] args) {

    }
}
