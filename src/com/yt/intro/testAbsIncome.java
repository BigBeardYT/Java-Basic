package com.yt.intro;

public class testAbsIncome {
    public static void main(String[] args) {
        /**
         * 方法一：为每一个子类分别创建实例,然后分别调用其对应的方法来获取该收入的税收
         */
        AbsIncome absIncome1 = new AIncome(3000);
        AbsIncome absIncome2 = new ASalary(7500);
        AbsIncome absIncome3 = new ASpecialAllowance(10000);
        double tax1 = absIncome1.getTax();
        double tax2 = absIncome2.getTax();
        double tax3 = absIncome3.getTax();
        double total_tax = tax1 + tax2 + tax3;
        System.out.println("—————————————方法一———————————————\n各种收入的分别收税为:\nIncome Tax: " +
                            tax1 + "\nSalary Tax: " + tax2 +"\nSpeical Tax: " + tax3 + "\n总收入为: " + total_tax);
        /**
         * 方法二，直接将父类引用指向子类的实例
         */
        AbsIncome [] absIncomes = new AbsIncome[] {
                new AIncome(3000),
                new ASalary(7500),
                new ASpecialAllowance(19999)
        };
        // 总的税收
        System.out.println("—————————————方法二———————————————\n中的收税为: \nTotal Tax: " + totalTax(absIncomes));
    }

    public static double totalTax(AbsIncome... absIncomes) {
        double res = 0;
        for(AbsIncome absIncome : absIncomes) {
            res += absIncome.getTax();
        }
        return res;
    }
}
