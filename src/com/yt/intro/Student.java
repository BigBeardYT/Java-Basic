package com.yt.intro;

public class Student extends Person{
    protected int score;
//    public void setScore(int score) {
//        this.score = score;
//    }
//    public int getScore(int score) {
//        return score;
//    }
//    public Student() {}
    public Student(String name, int age, int score) {
        super(name, age);
//        super(name, age);
//        this.name = name;
//        this.age = age;
        this.score = score;
    }
    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", score: " + score;
    }
}
