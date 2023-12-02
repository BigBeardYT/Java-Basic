package com.yt.collection;

import java.util.*;

public class test_TreeMap {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();


        List<Map<Integer, Integer>> list = new ArrayList<>();


        Map<Integer, Integer> m = new TreeMap<>();
        m.put(89, 2);
        m.put(44, 9);
        m.put(190, 1);
        m.put(13, 5);
        System.out.println(m.toString());
        list.add(m);
        System.out.println(list.get(0));

        System.out.println(m.remove(13));
        System.out.println(m.toString());
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score == o2.score) {
                    return 0;
                }
                return o1.score > o2.score ? -1 : 1;
            }
        });

        map.put(new Student("Lily", 88), 1);
        map.put(new Student("Bob", 74), 2);
        map.put(new Student("Mary", 92), 3);
        for(Map.Entry<Student, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + ", " + entry.getValue());


        }

        for(Student key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student("Bob", 74)));
    }

}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }




}
