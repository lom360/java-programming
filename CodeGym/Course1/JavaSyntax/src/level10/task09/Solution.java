package com.codegym.task.task10.task1009;

/* 
Correct answer: d = 5.5
Add one type conversion to get the following answer: d = 5.5

Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain an int variable a.
4. The main() method must contain an int variable b.
5. The main() method must contain an int variable c.
6. The main() method must contain an int variable e.
7. The main() method must contain a double variable d.
8. Don't change the initial value of the variables during initialization. You can only add cast operators.
9. The program should display the number 5.5.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d =  a +  b / c / (double) e;
        System.out.println(d);
    }
}
