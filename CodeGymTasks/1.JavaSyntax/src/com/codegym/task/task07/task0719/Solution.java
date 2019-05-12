package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        //write your code here
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            int index = list.size() - 1 - i; // This will start traversing the list at the end.
            System.out.println(list.get(index));
        }
    }
}
