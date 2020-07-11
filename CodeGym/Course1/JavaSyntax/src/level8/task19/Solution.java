package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        //Cat object that is created do not have an identifier/variable to remove objects.
        for (Cat cat: cats) {
            cats.remove( cat );
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> groupOfCats = new HashSet<Cat>();
        groupOfCats.add(new Cat());
        groupOfCats.add(new Cat());
        groupOfCats.add(new Cat());

        return groupOfCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        Iterator<Cat> itr = cats.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    // step 1
    public static class Cat {
        public static void Cat(){

        }
    }
}
