package com.codegym.task.task15.task1501;

/* 
OOP: Arrange interfaces
1. Add the Movable, Sellable, and Discountable interfaces to the Clothes class, if possible.
2. Implement their methods.

Requirements:
1. The Clothes class must support the Movable interface.
2. The Clothes class must support the Sellable interface.
3. The Clothes class must support the Discountable interface.
4. The Clothes class must implement the isMovable method.
5. The Clothes class must implement a getAllowedAction method with no parameters.
6. The Clothes class must implement a getAllowedAction method with one String parameter.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        public boolean isMovable() {
            return true;
        }

        public Clothes getAllowedAction(String name) {
            Clothes clothes = new Clothes();
            return clothes;
        }

        public Clothes getAllowedAction() {
            Clothes clothes = new Clothes();
            return clothes;
        }
    }
}
