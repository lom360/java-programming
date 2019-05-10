package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        ArrayList<Integer> divByThree = new ArrayList<Integer>();
        ArrayList<Integer> divByTwo = new ArrayList<Integer>();
        ArrayList<Integer> divByNone = new ArrayList<Integer>();

        for(int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if((x % 3) == 0 && (x % 2) == 0) {
                divByThree.add(x);
                divByTwo.add(x);
            }
            else if(x % 3 == 0) {
                divByThree.add(x);
            }
            else if(x % 2 == 0) {
                divByTwo.add(x);
            }
            else {
                divByNone.add(x);
            }
        }

        printList(divByThree);
        printList(divByTwo);
        printList(divByNone);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
