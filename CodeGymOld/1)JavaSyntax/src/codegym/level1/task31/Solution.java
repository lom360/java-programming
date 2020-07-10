package codegym.level1.task31;
import java.lang.Math;

/* 
More conversions

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(28));
    }

    public static int getFeetFromInches(int inches) {
        int feet = inches / 12;

        return Math.round(feet);
    }
}