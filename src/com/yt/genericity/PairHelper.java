package com.yt.genericity;

public class PairHelper {
    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }

    public static void main(String[] args) {
        Pair<? extends Number> p = new Pair<>(123, 456);
        Number x = p.getFirst();
        System.out.println(x);
        System.out.println(add(p));


    }
}
