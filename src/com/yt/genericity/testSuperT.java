package com.yt.genericity;

public class testSuperT {
    public static void main(String[] args) {
        Pair<? super Integer> p = new Pair<Integer>(1, 4);
        Object x = p.getFirst();
        System.out.println(x);
        p.setFirst(123);
        Object x2 = p.getFirst();
        System.out.println(x2);

    }
}
