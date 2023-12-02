package com.yt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_collecitons {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
