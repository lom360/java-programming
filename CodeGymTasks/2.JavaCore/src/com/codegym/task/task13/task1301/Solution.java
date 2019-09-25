package com.codegym.task.task13.task1301;

/* 
Beer
1. Think about which of the two interfaces you need to implement in the BeerLover class.
2. Add that interface to the BeerLover class and implement all its methods.
3. Think about the relationship between the READY_TO_GO_HOME variable and the isReadyToGoHome method.
4. Make the isReadyToGoHome method return the value of the READY_TO_GO_HOME variable.

Requirements:
1. The BeerLover class must implement the Alcoholic interface.
2. The BeerLover class must not directly implement the Drinker interface (just indirectly via Alcoholic).
3. The BeerLover class must implement all of the Alcoholic interface's methods.
4. The BeerLover class must implement all of the Drinker interface's methods.
5. The isReadyToGoHome method must return the value of the READY_TO_GO_HOME variable.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic{
        public void askForMore(String message) {
            System.out.println(message);
        }

        public void sayThankYou() {
            System.out.println("Thank You!!!");
        }

        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        public void sleepOnTheFloor() {
            System.out.println("ZZZZZZZZZ");
        }
    }
}