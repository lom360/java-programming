package com.codegym.task.task10.task1004;

/* 
Task No. 4 about integer type conversions
Add one type conversion to get the following answer: nine = 9
short number = 9;
char zero = '0';
int nine = (zero + number);

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command. You can only add cast operators to it.
3. The main() method must contain a short variable number.
4. The main() method must contain a char variable zero.
5. The main() method must contain an int variable nine.
6. Don't change the initial value of the variables during initialization. You can only add cast operators.
7. The program should display the number 9.
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number); // This will store 57 as the value.
        System.out.println((char) nine); // ASCII table shows that 57 represents 9. So use char typecast.
    }
}
