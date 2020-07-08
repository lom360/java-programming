package com.codegym.task.task11.task1108;

/* 
The unapproachable cat
Hide all of the Cat class's internal variables as well as any methods capable of changing the internal state of Cat objects.

Requirements:
1. The Cat class's variable name must be private.
2. The Cat class's variable age must be private.
3. The Cat class's variable weight must be private.
4. The getName getter must be public.
5. The setName setter must be private.
6. The getAge getter must be public.
7. The setAge setter must be private.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
