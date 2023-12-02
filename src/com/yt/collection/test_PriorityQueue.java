package com.yt.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class test_PriorityQueue {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // null,因为队列为空
//        我们放入的顺序是"apple"、"pear"、"banana"，但是取出的顺序却是"apple"、"banana"、"pear"，这是因为从字符串的排序看，"apple"排在最前面，"pear"排在最后面。
//
//因此，放入PriorityQueue的元素，必须实现Comparable接口，PriorityQueue会根据元素的排序顺序决定出队的优先级。
//
//如果我们要放入的元素并没有实现Comparable接口怎么办？PriorityQueue允许我们提供一个Comparator对象来判断两个元素的顺序。我们以银行排队业务为例，实现一个PriorityQueue：
        Queue<User> queue = new PriorityQueue<>(new UserPriorityQueue());
        queue.add(new User("zhangsan", "A3"));
        queue.add(new User("lisi", "V10"));
        queue.add(new User("Wangwu", "V2"));
        queue.add(new User("Hnn", "A1"));
        System.out.println(queue.poll().toString());
        System.out.println(queue.poll().toString());
    }
}

class UserPriorityQueue implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        // 如果都是A或V开头，比较号的大小
        if(u1.number.charAt(0) == u2.number.charAt(0)) {
            int num1 = Integer.valueOf(u1.number.substring(1, u1.number.length()));
            int num2 = Integer.valueOf(u2.number.substring(1, u2.number.length()));
            if(num1 < num2) {
                return -1;
            }
            return 1;
        }
        if(u1.number.charAt(0) == 'V') {
            // u1的优先级高
            return -1;
        }
        return 1;
    }
}

class User {
    public String name;
    public String number;
    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public String toString() {
        return this.name + ", " + this.number;
    }
}
