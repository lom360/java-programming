package com.codegym.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Catching custom exceptions
Requirements:
1. The handleExceptions method must call the BEAN.throwExceptions method.
2. The handleExceptions method should log the FileSystemException
   (call the BEAN.log method), and then rethrow it.
3. The handleExceptions method should only log (call the BEAN.log method)
   the CharConversionException.
4. The handleExceptions method should only log any IOException.
5. Add the FileSystemException class to the signature of the handleExceptions method.
6. The main method should use try-catch.
7. The main method should log the exceptions thrown by the handleExceptions method.
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        handleExceptions();
    }

    public static void handleExceptions() {
        try {
            BEAN.throwExceptions();
        }
        catch( FileSystemException e) {
            try {
                BEAN.log(e);
            }
            catch(Exception x) {
                throw x;
            }
        }
        catch(Exception e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void throwExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
