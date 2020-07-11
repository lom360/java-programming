package com.codegym.task.task10.task1013;

/* 
Human class constructors
Write a Human class with 6 fields.
Think up and implement 10 different constructors for it.
Each constructor should make sense.

Requirements:
1. The program must not read data from the keyboard.
2. There should be 6 fields in the Human class.
3. All of the Human class's fields must be private.
4. There should be 10 constructors in the Human class.
5. All of the Human class's constructors must be public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String hairColor;
        private String eyeColor;
        private String nationality;
        private int age;
        private int weight;
        private int height;

        public Human() {
            this.age = 1;
            this.weight = 100;
            this.height = 160; // In cm.
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String hairColor) {
            this.hairColor = hairColor;
        }

        public Human(int age, String hairColor) {
            this.age = age;
            this.hairColor = hairColor;
        }

        public Human(int height, int weight, String nationality) {
            this.height = height;
            this.weight = weight;
            this.nationality = nationality;
        }

        public Human(int age, String hairColor, String eyeColor) {
            this.age = age;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
        }

        public Human(String hairColor, String eyeColor, String nationality) {
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.nationality = nationality;
        }

        public Human(int age, int weight, int height, String hairColor, String eyeColor, String nationality) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.nationality = nationality;
        }
    }
}
