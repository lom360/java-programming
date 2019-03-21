package Lesson03.task02;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(50, .88));
        System.out.println(convertEurToUsd(2, .88));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
