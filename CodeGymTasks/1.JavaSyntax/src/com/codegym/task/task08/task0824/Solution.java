package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human grandFather1 = new Human(true);
        Human grandMother1 = new Human(false);
        Human grandFather2 = new Human(true);
        Human grandMother2 = new Human(false);
        Human father       = new Human(true);
        Human mother       = new Human(false);
        Human child1       = new Human(false);
        Human child2       = new Human(false);
        Human child3       = new Human(false);

        grandFather1.children.add(father);
        grandMother1.children.add(father);
        grandFather2.children.add(mother);
        grandMother2.children.add(mother);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human() {
            this.name = " ";
            this.sex = false;
            this.age = 100; // Just putting random number to make this quick.
            this.children = new ArrayList<Human>();
        }

        // Just to make this quick I made the same sex have the same values.
        public Human(boolean sex) {
            if(sex) {
                this.name = "Bob";
                this.age = 30;
                this.sex = sex;
                this.children = new ArrayList<Human>();
            }
            else {
                this.name = "Barb";
                this.age = 50;
                this.children = new ArrayList<Human>();
            }
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
