package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file
1. Read a file name from the console.
2. Display the contents of the file in the console (on the screen).
3. Don't forget to free up resources. Close the streams for file input and keyboard input.

Requirements:
1. The program must read the file name from the console.
2. The program must display the contents of the file.
3. You must close the file input stream (FileInputStream).
4. The BufferedReader must also be closed.
*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String fileName = reader.readLine(); // Store file name.
            InputStream inStream = new FileInputStream(fileName); // Pass in file name to store inStream.

            BufferedReader br = new BufferedReader(new InputStreamReader(inStream)); // Pass in inStream to read file.
            String line = null;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            inStream.close();
            reader.close();
        }
        catch (IOException e) {

        }

    }
}