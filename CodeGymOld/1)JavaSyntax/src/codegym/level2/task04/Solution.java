package codegym.level2.task02.task0204;

/*
Family relations

*/
public class Solution {
    public static void main(String[] args) {
        //Write your code here
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman;
        woman.husband = man;
        man.age = 28;
        woman.age = 31;

        System.out.println(man.wife.age);
        System.out.println(woman.husband.age);
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
