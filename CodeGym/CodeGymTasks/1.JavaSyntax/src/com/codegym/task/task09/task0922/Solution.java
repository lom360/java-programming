package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?
Enter a date in the format "2013-08-18"
Display this date in the format "AUG 18, 2013".
Use a Date object and SimpleDateFormat.


Requirements:
1. The program must read data from the keyboard.
2. A SimpleDateFormat variable must be declared in the program.
3. A Date variable must be declared in the program.
4. The program should display data on the screen.
5. The output must match the task conditions.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDate1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDate2 = new SimpleDateFormat("MMM dd, yyyy");
        try {
            String s = reader.readLine();
            Date date = simpleDate1.parse(s);
            System.out.println(simpleDate2.format(date).toUpperCase());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
