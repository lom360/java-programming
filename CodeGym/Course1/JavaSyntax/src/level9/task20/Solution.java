package com.codegym.task.task09.task0920;

/* 
Countdown
Use a loop to write a countdown from 10 to 0. To create a delay, use Thread.sleep(100);
Wrap the sleep call in a try-catch block.


Requirements:
1. The program should display a countdown from 10 to 0.
2. The program should display a new number every 100 milliseconds.
3. The program should use "Thread.sleep(100);".
4. The main method must have a try-catch block.
5. The main method should not throw exceptions.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //write your code here
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
