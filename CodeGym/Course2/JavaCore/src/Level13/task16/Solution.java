package com.codegym.task.task13.task1316;

/* 
Incorrect lines
Remove all incorrect lines from the Button interface.

Requirements:
1. The SimpleObject interface must be declared inside the Solution class.
2. The Button interface must be declared inside the Solution class.
3. Don't change the main method.
4. The declaration of the NAME constant must remain in the Button interface.
5. A correct declaration of the onPress method must remain in the Button interface.
*/

// Original Code
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        System.out.println(SimpleObject.NAME);
//        System.out.println(Button.NAME);
//    }
//
//    interface SimpleObject {
//        String NAME = "SimpleObject";
//
//        void onPress();
//    }
//
//    interface Button extends SimpleObject {
//
//        final String NAME = "Submit";
//
//        public void onPress();
//
//        protected void onPress();
//
//        void onPress();
//
//        private void onPress();
//
//        protected String onPress(Object o);
//
//        String onPress(Object o);
//
//        private String onPress(Object o);
//
//    }
//}

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        void onPress();
        String onPress(Object o);
    }
}