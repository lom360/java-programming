package level2.task14;

public class Solution {
    public static int min(int a, int b) {
        //write your code here
        if(a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
