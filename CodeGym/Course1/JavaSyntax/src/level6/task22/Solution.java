package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int size = 5;
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int[] sortedList = InsertionSort(arr);

        for(int i = 0; i < sortedList.length; i++) {
            System.out.println(sortedList[i]);
        }
    }

    public static int[] InsertionSort(int[] arr) {
        int i, j, key;
        for(i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }


        return arr;
    }
}
