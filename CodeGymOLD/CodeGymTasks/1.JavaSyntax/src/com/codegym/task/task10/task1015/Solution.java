package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists
Create an array whose elements are lists of strings.
Fill the array with any data and display it on the screen.

Requirements:
1. The createList method must declare and initialize an array with ArrayList<String> elements.
2. The createList method must return the created array.
3. The createList method must add elements (string lists) to the array. The lists must not be empty.
4. The program should display data on the screen.
5. The main method must call the createList method.
6. The main method must call the printList method.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("World");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Power");
        list2.add("Rangers");

        ArrayList<String>[] newList = new ArrayList[2];
        newList[0] = list1;
        newList[1] = list2;

        return newList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}