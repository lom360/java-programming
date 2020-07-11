package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Schwarzenegger", df.parse("JUNE 1 1980"));
        map.put("Li", df.parse("JANUARY 1 1980"));
        map.put("Statham", df.parse("FEBRUARY 1 1980"));
        map.put("Willis", df.parse("MARCH 1 1980"));
        map.put("Norris", df.parse("APRIL 1 1980"));
        map.put("Crews", df.parse("MAY 1 1980"));
        map.put("Couture", df.parse("JULY 1 1980"));
        map.put("Lundgren", df.parse("AUGUST 1 1980"));
        map.put("Hemsworth", df.parse("SEPTEMBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            long month = itr.next().getValue().getMonth();
            if(month == 5 || month == 6 || month == 7) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
