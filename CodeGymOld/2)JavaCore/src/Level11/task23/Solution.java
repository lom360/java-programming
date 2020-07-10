package com.codegym.task.task11.task1123;
/*
Write a method which returns the minimum and maximum numbers of an array.

Requirements:
1. The program must not read data from the keyboard.
2. Don't change the Pair class.
3. Don't change the main method.
4. Finish writing the getMinimumAndMaximum method. It must return a pair containing the minimum and maximum.
5. The program must return the correct result.
6. The getMinimumAndMaximum() method should not modify the inputArray array.
* */
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //write your code here
        int min = array[0]; // Start with the first index.
        int max = array[0]; // So that way we can just compare the values in the array.
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
            if(max < array[i]) {
                max = array[i];
            }
        }

        return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
