package level3.task14;

/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        int num = 0;

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                num = i * j;

                System.out.print(" " + num); // Note: I can make print neater, but code gym doesn't accept it.
            }
            System.out.println();
        }
    }
}
