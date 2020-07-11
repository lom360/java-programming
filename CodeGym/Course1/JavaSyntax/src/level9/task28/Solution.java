package com.codegym.task.task09.task0928;

import java.io.*;

/* 
The code won't compile…
Task: The program reads in two file names. It copies the first file to the location specified by the second file name.

Requirements:
1. The program must read file names.
2. Don't change the getInputStream method.
3. Don't change the getOutputStream method.
4. The program must copy the contents of the first file to the second one.
5. The program should display the number of copied bytes.
6. The main method should call the getInputStream method.
7. The main method should call the getOutputStream method.
*/

/* Original Code */
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String sourceFileName = reader.readLine();
//        String destinationFileName = reader.readLine();
//
//        InputStream fileInputStream = getOutputStream(destinationFileName);
//        InputStream fileOutputStream = getOutputStream(destinationFileName);
//
//        int count = 0;
//        while (fileInputStream.available() > 0) ;
//        {
//            int data = fileInputStream.read();
//            fileOutputStream.write(data);
//            count++;
//        }
//
//        System.out.println("Bytes copied: " + count);
//
//        fileInputStream.close();
//        fileOutputStream.close();
//    }
//
//    public static InputStream getInputStream(String fileName) throws IOException {
//        return new FileInputStream(fileName);
//    }
//
//    public static OutputStream getOutputStream(String fileName) throws IOException {
//        return new FileOutputStream(fileName);
//    }
//}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Bytes copied: " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}