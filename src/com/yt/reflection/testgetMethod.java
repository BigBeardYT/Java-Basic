package com.yt.reflection;

import java.lang.reflect.Method;

public class testgetMethod {
    public static void main(String[] args) throws Exception{
        Class c = Student.class;
        System.out.println(c);
        // 获取public方法getScore，参数为String
        System.out.println(c.getMethod("getScore", String.class));
        // 获取继承的public方法
        System.out.println(c.getMethod("getName"));

        // 获取私有的方法
        System.out.println(c.getDeclaredMethod("getGrade", int.class));

        String s = "Hello World";
        String r = s.substring(6);
        System.out.println("用普通的substring方法: " + r);
        // 用反射实现
        Class cls = s.getClass();
        Method m = cls.getMethod("substring", int.class);
        String r2 = (String)m.invoke(s, 6);
        System.out.println(r2);

        System.out.println("使用反射得到substring方法: " + r2);
        System.out.println(r2 == r);
        System.out.println(r2.equals(r));

        /* 多态， 考察一种情况，一个Person类定义了hello方法，并且它的子类Student也复写了这个方法，那么从Person.class获取的Method，作用于
        * Student实例时，真实调用的方法时哪个呢*/

        System.out.println("=====================多态=======================");
        Method m2 = Person2.class.getMethod("hello");
        m2.invoke(new Student());   // Student -> Hello
        /*因此，使用反射调用方法时，仍然遵循多态原则：即总是调用实际类型的覆写方法（如果存在）。上述的反射代码：*/
        /*上述的两行代码相当于 : Person2 p = new Student(); p.hello();*/



    }

}
class Student extends Person2 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 2;
    }

    public void hello() {
        System.out.println("Student -> Hello");
    }
}

class Person2 {
    public String getName() {
        return "Person";
    }

    public void hello() {
        System.out.println("Person -> Hello");

    }
}
