package com.codegym.task.task09.task0929;

import java.io.*;

/* 
Let's make the code do something useful!
Task: The program reads in two file names. It copies the first file to the location specified by the second file name.
New task: The program reads in two file names. It copies the first file to the location specified by the second file name.
If the specified file (to be copied) does not exist, then the program should display "File does not exist." and read a file name one more time and only then read the destination file name.

Requirements:
1. The program must read file names.
2. The main method must handle exceptions thrown by the getInputStream method. If an exception occurs, you should display "File does not exist.".
3. The program must copy the contents of the first file to the second one.
4. The main method should call the getInputStream method.
5. Don't change the getInputStream method.
6. The main method should call the getOutputStream method.
7. Don't change the getOutputStream method.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String sourceFileName = reader.readLine();
            String destinationFileName = reader.readLine();
            InputStream fileInputStream = getInputStream(sourceFileName);
            OutputStream fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }
        catch(Exception e) {
            System.out.println("File does not exist.");
            String destinationFileName = reader.readLine();
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

