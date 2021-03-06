package com.codegym.task.task15.task1513;

/* 
The simplest code: part 3
Simplify the code:
- remove everything that will be generated automatically by the compiler
- remove all class inheritance that will be added automatically by the compiler
- remove all constructors that will be automatically created and added.

Requirements:
1. The Car class should not have explicit no-argument constructors.
2. The Machine class should not have explicit no-argument constructors.
3. The Car class must be a descendant of the Machine class.
4. The code should not have explicit inheritance involving the Object class (extends Object).
5. The Car class should not explicitly inherit the Runnable interface.
*/

// Original Code
//public class Solution {
//    public static void main(String[] args) {
//    }
//
//    public interface Runnable {
//
//    }
//
//    public class Machine extends Object implements Runnable {
//        public Machine() {
//            super();
//        }
//    }
//
//    public class Car extends Machine implements Runnable {
//        public Car() {
//            super();
//        }
//    }
//}

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {

    }

    public class Car extends Machine {

    }
}