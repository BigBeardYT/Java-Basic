package com.yt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class test_Iterator {
    public static void main(String[] args) {
        ReverseList<String> list = new ReverseList<>();
        list.add("Abc");
        list.add("DDD");
        list.add("wei");
        for(String s : list) {
            System.out.println(s);

        }

    }
}

class ReverseList<T> implements Iterable<T> {
    private List<T> list = new ArrayList<>();
    public void add(T t) {
        list.add(t);
    }
    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;
        ReverseIterator(int index) {
            this.index = index;
        }
        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }


}