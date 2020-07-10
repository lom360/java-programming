package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    private String name, address, color;
    private int age, weight;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 10;
        this.color = "white";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "white";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "white";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 1;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
