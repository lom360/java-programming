package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] nameOfDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        if(num > 7 || num < 1) {
            System.out.println("No such day of the week");
        }
        else {
            System.out.println(nameOfDay[num - 1]); // Since index starts at 0 will subtract 1.
        }
    }
}