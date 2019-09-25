package com.codegym.task.task13.task1303;

/* 
Don't mix beer with cola
Implement the Drink interface in the Beer and Cola classes.

Requirements:
1. The Beer class must implement the Drink interface.
2. The Cola class must implement the Drink interface.
3. The Beer class must implement all of the Drink interface's methods.
4. The Cola class must implement all of the Drink interface's methods.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink{
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static class Cola implements Drink{
        public boolean isAlcoholic() {
            return false;
        }
    }
}
