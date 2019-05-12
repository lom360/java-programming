package com.codegym.task.task07.task0723;

/* 
Countdown

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //write your code here
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Boom!");
    }
}
