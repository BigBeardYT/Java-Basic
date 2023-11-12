package com.yt.collection;

import java.util.ArrayList;
import java.util.List;

public class equals_method {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = List.of("A", "B", "C");
        System.out.println(list.toString());
        System.out.println(list.contains("C"));
        System.out.println(list.contains(new String("C")));
        System.out.println(list.indexOf(new String("C")));
    }


}
