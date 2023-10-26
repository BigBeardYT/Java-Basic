package com.yt.genericity;

public class testSuperT {
    public static void main(String[] args) {
        Pair<? super Integer> p = new Pair<Integer>(1, 4);
        Object x = p.getFirst();
        System.out.println(x);
        p.setFirst(123);
        Object x2 = p.getFirst();
        System.out.println(x2);
        Pair<String> p2 = new Pair<>("sdd", "qqq");
        // 可以安全的向上转型
        Pair<?> p3 = p;
        System.out.println(p2.getFirst() + ", " + p2.getLast());
    }
}
