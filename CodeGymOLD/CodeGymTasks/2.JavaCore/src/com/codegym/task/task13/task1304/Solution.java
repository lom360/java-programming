package com.codegym.task.task13.task1304;

/* 
Selectable and Updatable
Make a Screen class that implements the Selectable and Updatable interfaces.
Don't forget to implement the methods!


Requirements:
1. The Screen class must implement the Selectable interface.
2. The Screen class must implement the Updatable interface.
3. The Screen class must implement all the Selectable interface's methods.
4. The Screen class must implement all the Updatable interface's methods.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //write your code here
    public class Screen implements Selectable, Updatable {
        public void onSelect() {

        }

        public void refresh() {

        }
    }
}
