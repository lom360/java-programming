package level2.task13;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Woman woman = new Woman();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
