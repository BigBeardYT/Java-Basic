package com.yt.intro;

public class ASpecialAllowance extends AbsIncome{
    public ASpecialAllowance(double income) {
        this.income = income;
    }
    @Override
    public double getTax() {
        return 0;
    }
}
