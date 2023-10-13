package com.yt.intro;

public class PrimaryStudent extends Student{
    protected int grade;
    public PrimaryStudent(){}
    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public String toString() {
        return super.toString() + ", grade: " + grade;
    }
}
