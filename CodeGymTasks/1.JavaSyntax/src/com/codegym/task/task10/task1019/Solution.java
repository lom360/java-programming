package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!
Task: The program reads a pair (a number and string) from the keyboard and displays it on the screen.
New task: The program reads pairs (a number and string) from the keyboard and stores them in a HashMap.
Any empty input signifies the end of data entry.
The numbers can be repeated.
The strings are always unique.
The entered data must not be lost!
The program then displays the contents of the HashMap on the screen.
Each pair on a new line.

Example input:
1
Sam
2
I
1
Am

Example output:
1 Sam
2 I
1 Am

Requirements:
1. The program must read data from the keyboard.
2. The program should display text on the screen.
3. In the main method, declare a HashMap variable and immediately initialize it.
4. The program should put the pairs read from the keyboard into the HashMap.
5. The program should display the contents of the HashMap in accordance with the conditions. The key and value are separated by a space. Each value should be on a new line.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String exit = reader.readLine();

            if(exit.equals("")) {
                break;
            }

            int id = Integer.parseInt(exit);
            String name = reader.readLine();

            map.put(name, id);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
