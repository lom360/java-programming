package com.codegym.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Corrections are needed
Task: The program demonstrates how a HashMap works: read a set of pairs (a number and string) from the keyboard, put them in a HashMap, and then displays the contents of the HashMap.

Requirements:
1. The program must read data from the keyboard.
2. The program should display text on the screen.
3. The Solution class must have three variables.
4. The program should fill the HashMap with 10 pairs read from the keyboard.
5. The program should display the contents of the HashMap. Each value should be on a new line.
*/

public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<Integer, String>();
        // The comment below was already included in the assignment but it's unnecessary.
        // map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
