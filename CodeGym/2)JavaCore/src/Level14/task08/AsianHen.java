package com.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    public int getMonthlyEggCount() {
        return 100000;
    }

    public String getDescription() {
        return super.getDescription() + " I come from " + Continent.ASIA + ". I lay " + getMonthlyEggCount()
                + " eggs a month.";
    }
}
