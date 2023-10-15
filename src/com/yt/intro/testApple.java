package com.yt.intro;

public class testApple {
    public static void main(String[] args) {
        /**
         * 抽象类不能实例化
         */
        // Fruit f1 = new Fruit(); // 'Fruit' is abstract; cannot be instantiated

        /**
         * 抽象类不可以被实例化，但是，可以使用main方法来调用，也可以写入初始化块体现，也可以在main方法中写对象。
         */
        Fruit f1 = new Fruit() {
            @Override
            public void run() {
                System.out.println("Fruit run()");
            }
        };
        f1.run();


        Apple a1 = new Apple();
        a1.run();

        a1.name = "苹果";
        System.out.println(a1.name);
        a1.year = 2;
        System.out.println(a1);
    }
}
