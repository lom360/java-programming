package com.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date currentTime = new Date(date); // This represents date since the beginning of the year.

        Date yearStartTime = new Date(); // This will store the start of the year.
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);  // Setting to the first day of the month.
        yearStartTime.setMonth(0); // Setting month to January.
        yearStartTime.setYear(currentTime.getYear()); // Must be the same year of the argument that was passed.

        long msTimeDifference = currentTime.getTime() - yearStartTime.getTime(); // Gets the number of days.
        long msDay = 24 * 60 * 60 * 1000; // The number of milliseconds in 24 hours.

        int dayCount = (int) (msTimeDifference/msDay);; // The number of full days.

        if(dayCount % 2 != 0) {
            return true;
        }
        // This branch statement is for the condition of when currentTime is January 1.
        else if(currentTime.compareTo(yearStartTime) == -1) {
            return true;
        }
        else {
            return false;
        }
    }
}
