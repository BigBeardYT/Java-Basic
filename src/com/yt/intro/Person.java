package com.yt.intro;

public class Person {
    protected String name;
    protected int age;

    public void setName(String name) {
        // 一般this的作用就相当与这个类的全局变量的指示，这里加上this是为了说明给全局变量赋值，在可以分清楚的地方，是可以不用this的，如在get方法中
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "name: " + name + ", " + "age: " + age;
    }
}
