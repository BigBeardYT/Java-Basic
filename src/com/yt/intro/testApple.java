package com.yt.intro;

public class testApple {
    public static void main(String[] args) {
        /**
         * 抽象类不能实例化
         */
        // Fruit f1 = new Fruit(); // 'Fruit' is abstract; cannot be instantiated

        Apple a1 = new Apple();
        a1.run();

        a1.name = "苹果";
        System.out.println(a1.name);
        a1.year = 2;
        System.out.println(a1);
    }
}
