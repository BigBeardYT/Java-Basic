package com.yt.intro;

public class AIncome extends AbsIncome{
    public AIncome(double income) {
        this.income = income;
    }
    public double getTax() {
        return income * 0.1;
    }

}
