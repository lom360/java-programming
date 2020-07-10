package com.codegym.task.task09.task0925;

/* 
Static modifiers are out of place
Rearrange the static modifiers so that the example compiles.

Requirements:
1. The class must have a variable A.
2. The class must have a variable B.
3. The class must have a variable C.
4. Don't change the main method.
5. Don't change the getA method.
6. There must be 3 static fields in the class.
*/

/* Original Code */
//public class Solution {
//    public int A = 5;
//    public int B = 2 * A;
//    public int C = A * B;
//    public int D = A * B;
//
//    public static void main(String[] args) {
//        Solution room = new Solution();
//        room.A = 5;
//
//        Solution.D = 5;
//    }
//
//    public int getA() {
//        return A;
//    }
//
//}

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}