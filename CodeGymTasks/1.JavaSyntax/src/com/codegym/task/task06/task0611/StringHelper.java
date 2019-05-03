package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //write your code here
        for(int i = 5; i > 0; i--) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your code here
        while(count > 0) {
            result = result + s;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
