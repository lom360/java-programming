package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int highestCount = 1; // This will keep track of the longest repeated sequence value.
        int count = 1; // This will keep track of the current value of nextNumEntered
        int nextNumEntered = list.get(0); // This will keep track the the num currently being repeated.
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) == nextNumEntered) {
                count++;
            }
            else {
                nextNumEntered = list.get(i);
                count = 1; // Reset count after a unique value is entered.
            }

            if(count > highestCount) highestCount = count;
        }

        System.out.println(highestCount);
    }
}