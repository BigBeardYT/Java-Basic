package com.yt.intro;

public class Student extends Person{
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
}
