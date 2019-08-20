package com.codegym.task.task11.task1107;

/* 
Our cat is too public!
Make some of the Cat class's internal variables private - but only those that will remain accessible via a method.

Requirements:
1. The variable name in the Cat class must be private.
2. The variable age in the Cat class must be private.
3. The variable weight in the Cat class must be public.
4. There must be three variables in the Cat class.
5. The Cat class must have private and public variables.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}