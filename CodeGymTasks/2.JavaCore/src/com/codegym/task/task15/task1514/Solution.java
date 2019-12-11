package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1
In a static block, initialize labels with 5 different key-value pairs.

Requirements:
1. The Solution class must only have one method (main).
2. The Solution class should declare a static Map field labels.
3. The field labels must be populated with 5 different key-value pairs in a static block.
4. The main method should display the contents of labels.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0, "AKB48");
        labels.put(2.0, "HKT48");
        labels.put(3.0, "SKE48");
        labels.put(4.0, "NMB48");
        labels.put(5.0, "SND48");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
