package level2.task17;

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        if(a <= b && a <= c && a <= d)      return a;
        else if(b <= c && b <= d && b <=a)  return b;
        else if(c <= d && c <= a && c <= b) return c;
        else                                return d;
    }

    public static int min(int a, int b) {
        //write your code here
        if(a <= b) return a;
        else       return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
