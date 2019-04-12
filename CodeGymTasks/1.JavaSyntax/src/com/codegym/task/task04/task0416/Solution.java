package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(reader.readLine());

        // Since the total time for all three colors to occur before repeating is 5min.
        // Then we can just mod by 5 to make our life simple when checking what colors
        // it is on in regards to time.
        if(t % 5 < 3) {
            System.out.println("green");
        }
        else if(t % 5 < 4) {
            System.out.println("yellow");
        }
        else {
            System.out.println("red");
        }
    }
}