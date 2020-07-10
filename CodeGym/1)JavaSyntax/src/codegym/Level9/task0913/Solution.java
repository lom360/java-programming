package com.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Exceptions. Just exceptions.
Requirements:
1. The main method must call method1.
2. The main method must catch the NullPointerException exception.
3. The main method must catch the FileNotFoundException exception.
4. The main method must not catch the ArithmeticException exception.
5. The main method must not catch the URISyntaxException exception.
6. Don't change the method1 method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            method1();
        }
        //write your code here
        catch(NullPointerException e) {
            System.out.println(e);
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
