package com.yt.genericity;

public class Pair<T> {
    public T first;
    private T last;
    public Pair (T first, T last) {
        this.first = first;
        this.last = last;
    }


    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 静态泛型方法应该使用其他类型区分:  这样才能清楚地将静态方法的泛型类型和实例类型的泛型类型区分开。
    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }

    @Override
    public String toString() {
        return "First: " + this.first + ", Last: " + this.last;
    }
}
