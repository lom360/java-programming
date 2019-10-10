package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file
1. Read a file name from the console.
2. Read a set of numbers from the file.
3. Display only the even numbers, sorted in ascending order.

Example input:
5
8
-2
11
3
-5
2
10

Example output:
-2
2
8
10

Requirements:
1. The program must read data from the console.
2. The program must create a FileInputStream using the line read from the console.
3. The program should display data on the screen.
4. The program should display all of the even numbers read from the file, sorted in ascending order.
5. The program must close the input stream used to read the file (FileInputStream).
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        BufferedReader readFile = new BufferedReader(new InputStreamReader(file));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(true) {
            String stringNum = readFile.readLine();
            if(stringNum == null) {break;}

            Integer number = Integer.parseInt(stringNum);

            if(number % 2 == 0) {
                list.add(number);
            }
        }

        for(int i = 1; i < list.size(); i++) {
            int key = i;
            int j = i - 1;
            while(j <= 0 && (key < list.get(j))) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j+1, key);
        }

        for(Integer i : list) {
            System.out.println(i);
        }
    }
}

