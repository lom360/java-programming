package codegym.level2.task02.task0203;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //Write your code here
        double Fahrenheit =  ((double) 9 / 5 * celsius) + 32;

        return Fahrenheit;
    }
}
