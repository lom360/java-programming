package com.codegym.task.task10.task1007;

/* 
Task No. 7 about integer type conversions
Remove unnecessary operators to get the correct answer: 1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain a long variable l.
4. The main() method must contain an int variable x.
5. The main() method must contain a double variable m.
6. The main() method must contain a float variable f.
7. Don't change the initial value of the variables during initialization. You can only change the cast operators.
8. The program should display 1234567.
*/

public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}