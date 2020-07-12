package level2.task06;
import java.text.DecimalFormat;


/*
Calculate the circumference of a circle

*/


public class Solution {
    // Creating a decimalFormat object to control number decimal places to be printed.
    private static DecimalFormat decimalFormat = new DecimalFormat("#.#");

    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        //write your code here
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        System.out.println(decimalFormat.format(circumference)); // Applying decimalFormat to control decimal places.
    }
}