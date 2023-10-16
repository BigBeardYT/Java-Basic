package com.yt.intro;

public class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }
    /**
     * 有一种类，它被定义在另一个类的内部，所以被称为内部类（Nested Class）。Java的内部类分为好几种，通常情况下用得不多，
     * 下面这个Inner就是一个内部类，它与普通类最大的不同就是Inner Class的实例不能单独存在，必须依附于一个外部类的实例
     * Inner Class和普通Class相比，除了能引用Outer实例外，还有一个额外的“特权”，就是可以修改Outer Class的private字段，
     * 因为Inner Class的作用域在Outer Class内部，所以能访问Outer Class的private字段和方法
     *
     * 观察Java编译器编译后的.class文件可以发现，Outer类被编译为Outer.class，而Inner类被编译为Outer$Inner.class。
     */
    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
    /**
     * 还有一种，匿名类，也是内部类的一种
     */
    void asyncHello() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }




}
