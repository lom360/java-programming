package codegym.level2;

public class Solution {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }
    public static void print(String s) {
        for(int i = 4; i > 0; i--) {
            System.out.println(s);
        }
    }
}
