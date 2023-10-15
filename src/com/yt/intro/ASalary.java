package com.yt.intro;

public class ASalary extends AbsIncome{
    public ASalary(double income) {
        this.income = income;
    }
    @Override
    public double getTax() {
        return income <= 5000 ? 0 : (income - 5000) * 0.2;

    }
}
