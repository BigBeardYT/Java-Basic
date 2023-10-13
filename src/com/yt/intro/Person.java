package com.yt.intro;

public class Person {
    protected String name;
    protected int age;

    public void setName(String name) {
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
