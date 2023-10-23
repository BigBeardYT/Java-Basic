package com.yt.reflection;

import java.lang.reflect.Field;

public class testgetsetFeild {
    public static void main(String[] args) throws Exception {
        Object p = new Person("Zhang san");
        Class cls = p.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);  // 不管这个字段是不是public、private还是protected，一律允许访问

        Object value = field.get(p);
        System.out.println(value);

        Object p2 = new Person("Lisi", 10);
        Class cls2 = p2.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        Object o2 = f.get(p2);
        System.out.println(o2);

    }
}

class Person {
    private String name;
    private int age;
    public Person(String name) {
        this.name = name;

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
