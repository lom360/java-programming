package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    public int getMonthlyEggCount() {
        return 10;
    }

    public String getDescription() {
        return super.getDescription() + " I come from " + Continent.AFRICA + ". I lay " + getMonthlyEggCount()
                + " eggs a month.";
    }
}
