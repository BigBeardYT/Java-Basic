package com.yt.intro;

public abstract class AbsIncome {
    protected double income;
    public void setIncome(double income) {
        this.income = income;
    }
    public AbsIncome(){}
    public AbsIncome(double income) {
        this.income = income;
    }
    public abstract double getTax();
}
