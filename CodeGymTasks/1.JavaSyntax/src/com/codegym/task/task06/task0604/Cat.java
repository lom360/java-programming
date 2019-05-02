package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    //write your code here
    public Cat() {
        this.catCount++;
    }

    protected void finalize() throws Throwable {
        this.catCount--;
    }

    public static void main(String[] args) {

    }
}