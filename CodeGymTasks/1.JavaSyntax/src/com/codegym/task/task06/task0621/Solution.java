package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        System.out.println(catGrandFather.toString());
        System.out.println(catGrandMother.toString());
        System.out.println(catFather.toString());
        System.out.println((catMother.toString()));
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "The cat's name is " + name + ", no mother" + ", no father";
            }
            else if(mother == null && father != null) {
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            }
            else if(mother != null && father == null) {
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            }
            else {
                return "something";
            }
        }
    }

}
