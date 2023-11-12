package com.yt.collection;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(12);

        List<?> list = new ArrayList<>();
        list = ls;
        System.out.println(list.toString());

        List<Integer> lst = List.of(1, 2, 3);
        System.out.println(lst.toString());


    }
}
