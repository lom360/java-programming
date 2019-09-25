package com.codegym.task.task13.task1302;

/* 
Beer. Part 2. The recovery.
Add the Drink interface to the AlcoholicBeer class and implement all of its methods.

Requirements:
1. The AlcoholicBeer class must implement the Drink interface.
2. The AlcoholicBeer class must implement all of the Drink interface's methods.
3. There must be only two methods in the AlcoholicBeer class.
4. The isAlcoholic method must return true, since beer contains alcohol.
5. Depending on what the isAlcoholic method returns, the program must display the corresponding drink type on the screen.
*/

public class Solution {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

   public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink{
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Alcoholic beverage";
            } else {
                return "Non-alcoholic beverage";
            }
        }

        public boolean isAlcoholic() {
            return true;
        }
    }
}