package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move
The public CanFly, CanMove, and CanEat interfaces have already been written.
Add these interfaces to the Dog, Car, Duck, and Airplane classes.

Requirements:
1. The Solution class must have a CanFly interface with only one method called fly().
2. The Solution class must have a CanMove interface with only one method called move().
3. The Solution class must have an CanEat interface with only one method called eat().
4. A dog must be able to move around and eat.
5. A car must be able to move.
6. A plane must be able to move and fly.
7. A duck should be able to move, fly, and eat.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public abstract class Dog implements CanMove, CanEat{
    }

    public abstract class Duck implements CanFly, CanMove, CanEat{
    }

    public abstract class Car implements CanMove{
    }

    public abstract class Airplane implements CanFly, CanMove{
    }
}
