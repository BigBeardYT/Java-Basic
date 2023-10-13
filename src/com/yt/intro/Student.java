package com.yt.intro;

public class Student extends Person{
    /**
     * 在Java中，每个类都具有父类。如果一个类没有声明父类，则默认情况下会继承java.lang.Object。一个类的构造方法用于创建该类的对象，
     * 并初始化该对象的成员变量。但是，如果一个类有父类，则必须在子类的构造方法中显式地调用其父类的构造方法来初始化父类的成员变量。
     * 这是因为在Java中，子类的构造方法中必须先调用其父类的构造方法，以确保所有继承的成员变量都已经被正确初始化。如果没有显式调用父类构造方法，
     * 则Java编译器会自动在子类的构造方法中调用默认的父类构造方法，以确保正确的初始化。这种规定确保了Java中类的正确继承行为。
     */

    protected int score;
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore(int score) {
        return score;
    }
    public Student() {}
    // 如果父类没有默认的构造方法，子类就必须显示的调用super（）并给出参数以便让编译器定位到父类的一个合适构造方法
    // 另外：子类不会继承任何父类的构造方法，子类默认的构造方法时编译器自动生成的（或者编写的），不是继承的

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    @Override
    public String toString() {
        return super.toString() + ", score: " + score;
    }

    @Override
    public void run() {
        System.out.println("Student run ... ");
    }
}
