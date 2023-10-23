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
        Object obj = cls.getMethod("substring", int.class).invoke(s, 6);
        obj = (Method)obj;
        String r2 = (String)((Method) obj).invoke(s, 7);
        System.out.println(r2);

        System.out.println("使用反射得到substring方法: " + obj);

        System.out.println(obj.equals(r));

    }

}
class Student extends Person2 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 2;
    }
}

class Person2 {
    public String getName() {
        return "Person";
    }
}
