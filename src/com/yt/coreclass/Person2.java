package com.yt.coreclass;

import com.yt.intro.Person;

public class Person2 extends Person {
    public static int count;
    public Person2(String name, int age) {
        super(name, age);
        System.out.println("Person2 Constractor");
        count+=10;
        System.out.println("Person2 count: " + count);
    }
    public String toString() {
        return super.toString();
    }
//    public static int getCount() {
//        return count;
//    }
}
