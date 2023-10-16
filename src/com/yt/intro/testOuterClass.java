package com.yt.intro;

public class testOuterClass {
    public static void main(String[] args) {

        Outer outer = new Outer("内部类1");
        Outer.Inner inner = outer.new Inner();  // 实例化一个Inner
        inner.hello();
    }
}
