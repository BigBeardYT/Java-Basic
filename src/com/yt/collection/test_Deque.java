package com.yt.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class test_Deque {
    public static void main(String[] args) {
        /*
        双端队列，两头都允许进，都允许出 - Double Ended Queue 学名为Deque
        Java集合提供了接口Dequel来实现一个双端队列，它的功能是：
            1. 既可以添加到队尾，也可以添加到队首
            2. 既可以从队首获取，又可以从队尾获取

         */
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addFirst(6);
        System.out.println(deque.toString());
        deque.offerFirst(8);
        System.out.println(deque.toString());
        deque.pop();
        System.out.println(deque.toString());
        deque.poll();
        System.out.println(deque.toString());
        deque.pollLast();
        System.out.println(deque.toString());

        Deque<String> deque1 = new ArrayDeque<>();
        deque1.offerLast("A");
        deque1.offerLast("B");
        deque1.offerLast("C");
        System.out.println(deque1.toString());

    }


}
