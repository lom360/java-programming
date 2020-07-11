package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("Superman", 30, 500, 10000000);
        Cat cat2 = new Cat("Wonder Woman", 2500000, 150, 100000);
        Cat cat3 = new Cat("Batman", 54, 230, 100);

        boolean results1 = cat1.fight(cat2);
        boolean results2 = cat2.fight(cat3);
        boolean results3 = cat3.fight(cat1);

        System.out.println(results1);
        System.out.println(results2);
        System.out.println(results3);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
