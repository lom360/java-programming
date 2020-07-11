package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set = new HashSet<Integer>();

        int num = 0;
        for(int i = 0; i < 20; i++) {
            set.add(num);
            num += 2;
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        Iterator<Integer> numIterator = set.iterator();

        while(numIterator.hasNext()) {
            if(numIterator.next() > 10) {
                numIterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
