package com.codegym.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> resultCats = new HashSet<Cat>();

        //write your code here
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        return resultCats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resultDogs = new HashSet<Dog>();
        //write your code here
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        return resultDogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> resultPets = new HashSet<Object>();

        resultPets.addAll(cats);
        resultPets.addAll(dogs);

        return resultPets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        pets.remove(cats);
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        Iterator<Object> itr = pets.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    //write your code here
    public static class Cat {
        public static void Cat() {

        }
    }

    public static class Dog {
        public  static  void  Dog() {

        }
    }
}
