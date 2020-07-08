package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {

    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        return word;
    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        return num;
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double float_num = Double.parseDouble(reader.readLine());
        return float_num;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = Boolean.parseBoolean(reader.readLine());
        return bool;
    }

    public static void main(String[] args) {

    }
}
