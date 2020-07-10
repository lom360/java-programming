package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of city
        List<String> city = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            city.add(family);
        }

        // Read the house number
        String cityName = reader.readLine();

        if (city.contains(cityName)) {
            int familyName = city.indexOf(cityName) + 1; // Plus one since family name is the next index after city.
            System.out.println(city.get(familyName));
        }
    }
}
