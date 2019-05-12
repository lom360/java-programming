package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human human1 = new Human("Cait Sith", true, 22);
        Human human2 = new Human("Barret", true, 22);
        Human human3 = new Human("Vincent", true, 22);
        Human human4 = new Human("Cid", true, 22);
        Human human5 = new Human("Cloud", true, 22, human3, human4);
        Human human6 = new Human("Cloud", true, 22, human3, human4);
        Human human7 = new Human("Cloud", true, 22, human3, human4);
        Human human8 = new Human("Cloud", true, 22, human3, human4);
        Human human9 = new Human("Cloud", true, 22, human3, human4);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        // write your code here
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}