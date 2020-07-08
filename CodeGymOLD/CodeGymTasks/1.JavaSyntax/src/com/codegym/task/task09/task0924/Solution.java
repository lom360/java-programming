package com.codegym.task.task09.task0924;

import java.util.ArrayList;

/* 
A scary fairy tale
1. Once there were five classes: red riding hood, grandmother, pie, woodcutter, and wolf.
2. Each class has 2 fields: ArrayList killed and ArrayList ate.
3. The necessary objects have been created (hood, grandmother, ...).
4. Arrange the relationships correctly according to who ate and/or killed who in the fairy tale "Little Red Riding Hood".

PS: Nobody ate the pie. It was only carried in a basket. The wolf ate a little. And then he was killed.


Requirements:
1. The main method should change the state (internal variables) of the wolf object.
2. The main method should change the state (internal variables) of the woodcutter object.
3. Nobody ate the pie.
4. The wolf ate a little.
5. And then the wolf was killed.
*/

public class Solution {
    public static RedRidingHood hood = new RedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodcutter woodcutter = new Woodcutter();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        // write your code here
        wolf.ate.add(hood);
        wolf.ate.add(grandmother);
        woodcutter.killed.add(wolf);
    }

    // Red riding hood
    public static class RedRidingHood extends StoryItem {
    }

    // Grandmother
    public static class Grandmother extends StoryItem {
    }

    // Pie
    public static class Pie extends StoryItem {
    }

    // Woodcutter
    public static class Woodcutter extends StoryItem {
    }

    // Wolf
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
