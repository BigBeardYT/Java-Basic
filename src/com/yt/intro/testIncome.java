package com.yt.intro;

public class testIncome {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(10000)
        };
        /**
         * 利用多态，totalTax()方法只需要和Income打交道，它完全不需要知道Salary和StateCouncilSpecialAllowance的存在，就可以正确计算出总的税。
         */
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes) {
        double res = 0;
        for(Income income : incomes) {
            res += income.getTax();
        }
        return res;
    }
}
