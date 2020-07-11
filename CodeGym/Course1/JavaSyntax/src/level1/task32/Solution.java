package level1.task32;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;

        while(number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
}