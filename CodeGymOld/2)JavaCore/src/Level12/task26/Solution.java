package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run
1. In the Solution class, make a public CanFly interface with a void fly() method.
2. In the Solution class, make a public CanClimb interface with a void climb() method.
3. In the Solution class, make a public CanRun interface with a void run() method.
4. Use common sense to decide which interfaces you need to add to each class.
5. Add interfaces to the Cat, Dog, Tiger, and Duck classes.

Requirements:
1. The Solution class must have a CanFly interface with a void fly() method.
2. The Solution class must have a CanClimb interface with a void climb() method.
3. The Solution class must have a CanRun interface with a void run() method.
4. A Cat object must be able to run (support the CanRun interface) and climb trees (support the CanClimb interface).
5. A Dog object must be able to run (support the CanRun interface).
6. The Tiger class must be a Cat.
7. A Duck object must be able to run (support the CanRun interface) and fly (support the CanFly interface).
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public abstract class Cat implements CanClimb, CanRun{
    }

    public abstract class Dog implements CanRun{
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements CanFly, CanRun{
    }
}
