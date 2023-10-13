package com.yt.intro;

public class testOverrideStudent {
    public static void main(String[] args) {
        Person p1 = new Student();
        // 像这种，父类的变量引用子类的实例，那么调用同一个重写的方法的时候会调用子类的还是父类的呢
        p1.run();   // 调用的时子类的
        p1.name = "sdfjk";
        System.out.println(p1);
        /** 由此可得出一个结论：Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
         *  这个非常重要的特性在面向对象编程中称之为多态。它的英文拼写非常复杂：Polymorphic。
         * */
    }
}
