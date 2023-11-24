package com.yt.collection;

import org.apache.logging.log4j.core.config.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class equals_method {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = List.of("A", "B", "C");
        System.out.println(list.toString());        // [A, B, C]
        System.out.println(list.contains("C"));     // true
        System.out.println(list.contains(new String("C"))); // true -> 因为List 的内部是通过equals来判断的，而不是==
        System.out.println(list.indexOf(new String("C")));  // 2
        System.out.println(list.get(2) == new String("C")); // false
        System.out.println(list.get(2).equals(new String("C")));    // true

        // person类实验
        List<Person> personList = List.of(
                new Person("Xiao Ming", 12),
                new Person("Mary", 13),
                new Person("Bob", 14));
        // 没有重写equals方法的结果：
        System.out.println(personList.contains(new Person("Mary", 13)));    // --> true

        // 使用indexOf方法返回索引
        System.out.println(personList.indexOf(new Person("Mary", 13)));

    }


}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;this.age = age;
    }




//    public boolean equals(Object o) {
//        if(o instanceof Person p) {
//            return this.name.equals(p.name) && this.age == p.age;
//        }
//        return false;
//    }
//    public int indexOf(Object o) {
//        if(o instanceof Person p) {
//            if(Objects.equals(this.name, p.name) && this.age == p.age) {
//                return 1;
//            }
//        }
//        return -1;
//    }


//    public boolean equals1(Object o) {
//        if(o instanceof Person p) {
//            boolean nameEquals = false;
//            // 判断是否为空
//            if(this.name == null && p.name == null) {
//                return true;
//            }
//            if(this.name != null) {
//                nameEquals = this.name.equals(p.name);
//            }
//            return nameEquals && this.age == p.age;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person p) {
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}