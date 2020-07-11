package com.codegym.task.task10.task1001;

/* 
Task No. 1 about integer type conversions
Arrange the cast operators correctly to get the required result: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain an int variable a.
4. The main() method must contain an int variable b.
5. The main() method must contain a byte variable c.
6. The main() method must contain a double variable f.
7. The main() method must contain a long variable d.
8. Don't change the initial value of the variables during initialization. You can only edit (add/remove/change) the cast operators.
9. The program should display a number greater than 0.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}
