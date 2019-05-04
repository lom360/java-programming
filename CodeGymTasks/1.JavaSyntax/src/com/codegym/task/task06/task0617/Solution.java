package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws  IOException {
        printIdea(new Idea());
    }

    //write your code here
    public static class Idea {
        public String getDescription() throws IOException {
            return "Hello World";
        }
    }

    public static void printIdea(Idea idea) throws IOException {
        System.out.println(idea.getDescription());
    }
}
