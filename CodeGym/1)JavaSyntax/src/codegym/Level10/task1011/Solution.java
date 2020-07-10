package com.codegym.task.task10.task1011;

/* 
Big salary
Display "I do not want to learn Java. I want a big salary" 43 times according to the following pattern.

Pattern:
I do not want to learn Java. I want a big salary
 do not want to learn Java. I want a big salary
do not want to learn Java. I want a big salary
o not want to learn Java. I want a big salary
 not want to learn Java. I want a big salary
not want to learn Java. I want a big salary
…
salary

Requirements:
1. The program should display text on the screen.
2. The program should display 43 lines.
3. The program must use a for loop or a while loop.
4. The output should match the example in the conditions.
*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        //write your code here
        int count = 0;
        for(int i = 0; s.length() >= 6; i++) { // salary has 6 letters. So we stop loop when string length is 6.
            System.out.println(s);
            s = s.substring(1);
        }
    }
}

