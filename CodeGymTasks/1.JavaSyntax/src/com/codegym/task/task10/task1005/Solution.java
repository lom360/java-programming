package com.codegym.task.task10.task1005;

/* 
Task No. 5 about integer type conversions
Arrange the cast operators correctly to get the answer: c = 256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain an int variable a.
4. The main() method must contain an int variable b.
5. The main() method must contain a short variable c.
6. Don't change the initial value of the variables during initialization. You can only change the cast operators.
7. The program should display the number 256.
*/

public class Solution {
    public static void main(String[] args) {
        int a =  44;
        int b =  300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}