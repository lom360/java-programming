package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    private int top, left, width, height;

    public Rectangle(int top) {
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int width) {
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int width, int left) {
        this.top = top;
        this.width = width;
        this.left = left;
        this.height = width;
    }

    public Rectangle(int top, int width, int left, int height) {
        this.top = top;
        this.width = width;
        this.left = left;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
