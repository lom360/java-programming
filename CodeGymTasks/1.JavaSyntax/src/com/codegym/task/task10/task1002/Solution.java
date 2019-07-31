package com.codegym.task.task10.task1002;

/* 
Task No. 2 about integer type conversions
Arrange the cast operators correctly to get the required result: d = 3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain an int variable a.
4. The main() method must contain an int variable b.
5. The main() method must contain a float variable f.
6. The main() method must contain a double variable d.
7. Don't change the initial value of the variables during initialization. You can only add cast operators.
8. The program should display the number 3.765.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = (double) a * 1e-3 + c;

        System.out.println(d);
    }
}
