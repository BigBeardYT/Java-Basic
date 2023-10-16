package com.yt.coreclass;
import com.yt.intro.Person;
public class testProtected {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 19);
//        p1.name = "df";
        System.out.println(p1.getAge());
        Person2 p2 = new Person2("李四-测试", 44);
        System.out.println(p2);
        System.out.println(Person.getCount());
        System.out.println(Person2.getCount());
    }
}
