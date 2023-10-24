package com.yt.annotation;

public class Person {
    @Range(min = 1, max = 255)
    public String name;

    @Range(max = 10)
    public String city;
    /*
    定义了注解，本身对程序并没有任何影响，我们必须自己编写代码来使用注解。这里，我们编写一个Person实例的检查方法，它可以检查Person实例的String字段长度是否满足注解@Range中的定义
     */

    @Range(min = 0, max = 100)
    public int age;
}
