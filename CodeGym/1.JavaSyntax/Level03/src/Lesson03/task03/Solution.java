package Lesson03.task03;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {

        return i * 1.10; // This is essentially equal to i + i(.10);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
