package com.codegym.task.task12.task1219;

/* 
Making a human
We have public CanFly, CanRun, and CanSwim interfaces.
Add these interfaces to the Human, Duck, Penguin, and Airplane classes.

Requirements:
1. The Solution class must have a CanFly interface with only one method called fly().
2. The Solution class must have a CanRun interface with only one method called run().
3. The Solution class must have a CanSwim interface with only one method called swim().
4. A human must be able to run and swim.
5. A Duck should be able to fly, swim, and run.
6. A Penguin must be able to swim and run.
7. A Plane must be able to fly and run (gotta get off that runway somehow!)
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public abstract class Human implements CanRun, CanSwim{

    }

    public abstract class Duck implements CanFly, CanRun, CanSwim{

    }

    public abstract class Penguin implements CanRun, CanSwim{

    }

    public abstract class Airplane implements CanRun, CanFly{

    }
}
