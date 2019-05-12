package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++) {
            int evenOrOdd = list.get(i).length();
            if(evenOrOdd % 2 == 0) {
                String s = list.get(i) + " " + list.get(i);
                newList.add(s);
            }
            else {
                String s = list.get(i) + " " + list.get(i) + " " + list.get(i);
                newList.add(s);
            }
        }

        for(int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listUpperCase.size(); i++) {
//            System.out.println(listUpperCase.get(i));
//        }
    }
}
