package com.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
Exception when working with Map collections
Requirements:
 • The program should display a message on the screen.
 • The program must have a try-catch block.
 • The program must catch a specific type of exception, not all possible exceptions
   (i.e. not Exception).
 • The displayed message must contain the type of exception that occurred.
 • Don't delete the existing code in the main method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        //write your code here
        catch(NullPointerException e) {
            System.out.println(e);
        }
    }
}
