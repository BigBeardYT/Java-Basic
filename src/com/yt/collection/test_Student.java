package com.yt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class test_Student {
    public static void main(String[] args) {
//        Student s = new Student("Bob", 84);
        List<Student> studentList = List.of(
                new Student("Bob", 84),
                new Student("Mary", 87),
                new Student("Joy", 98)
        );
        Students students = new Students(studentList);
        System.out.println(students.getScore("Bob"));
    }
}

class Students {
    List<Student> list;
    Map<String, Integer> cache;

    Students(List<Student> list) {
        this.list = list;
        cache = new HashMap<>();
    }

    /**
     * 根据name查找score，找到返回score，未找到返回-1
     */
    int getScore(String name) {
        Integer score = cache.get(name);
        if(score == null) {
            // 分数为空，将其put进去
            int sr = findInList(name);
            cache.put(name, sr);
        }
        return cache.get(name);
    }

    Integer findInList(String name) {
        for(Student ss : this.list) {
            if(ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }

}

//class Student {
//    public String name;
//    public int score;
//    public Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//}
