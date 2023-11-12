package com.yt.collection;

import org.apache.logging.log4j.core.config.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class equals_method {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = List.of("A", "B", "C");
        System.out.println(list.toString());
        System.out.println(list.contains("C"));
        System.out.println(list.contains(new String("C"))); // 因为List 的内部是通过equals来判断的，而不是==
        System.out.println(list.indexOf(new String("C")));
        System.out.println(list.get(2) == new String("C"));
        System.out.println(list.get(2).equals(new String("C")));

        // person类实验
        List<Person> personList = List.of(
                new Person("Xiao Ming"),
                new Person("Mary"),
                new Person("Bob"));
        // 没有重写equals方法的结果：
        System.out.println(personList.contains("Mary"));    // --> false
    }


}

class Person {
    String name;
    int age;
    public Person(String name) {
        this.name = name;
    }

//    public boolean equals(Object o) {
//        if(o instanceof Person p) {
//            return this.name.equals(p.name) && this.age == p.age;
//        }
//        return false;
//    }

    public boolean equals1(Object o) {
        if(o instanceof Person p) {
            boolean nameEquals = false;
            // 判断是否为空
            if(this.name == null && p.name == null) {
                return true;
            }
            if(this.name != null) {
                nameEquals = this.name.equals(p.name);
            }
            return nameEquals && this.age == p.age;
        }
        return false;
    }
    public boolean equals(Object o) {
        if(o instanceof Person p) {
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}