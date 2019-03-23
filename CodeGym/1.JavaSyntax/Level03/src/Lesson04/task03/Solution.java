package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        Zerg zergling  = new Zerg();
        Zerg hydras    = new Zerg();
        Zerg queen     = new Zerg();
        Zerg ultralisk = new Zerg();
        Zerg overlord  = new Zerg();

        zergling.name  = "Zergling";
        hydras.name    = "Hydras";
        queen.name     = "!ueen";
        ultralisk.name = "Ultralisk";
        overlord.name  = "Overlord";

        Terran marines  = new Terran();
        Terran firebats = new Terran();
        Terran medics   = new Terran();
        Terran ghost    = new Terran();

        marines.name  = "Marines";
        firebats.name = "Firebats";
        medics.name   = "Medics";
        ghost.name    = "Ghost";

        Protoss zealots      = new Protoss();
        Protoss dragoon      = new Protoss();
        Protoss dark_templar = new Protoss();

        zealots.name      = "Zealots";
        dragoon.name      = "Dragoon";
        dark_templar.name = "Dark Templar";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
