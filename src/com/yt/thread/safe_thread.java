package com.yt.thread;

public class safe_thread {
    public static void main(String[] args) {
        // 如果一个类被设计为允许多线程正确访问，我们就说这个类就是“线程安全”的（thread-safe），下面这个MyCounter类就是线程安全的。
        MyCounter mc1 = new MyCounter();
        MyCounter mc2 = new MyCounter();
//        Thread t1 = new Thread(() -> {
//            mc1.add(10);
//            mc2.dec(5);
//            mc1.add(1);
//            mc1.dec(8);
//
//        });
//
//        Thread t2 = new Thread(() -> {
//            mc1.dec(3);
//            mc2.add(4);
//        });
//
//        t1.start();
//        t2.start();
//        System.out.println(mc1.get());
//        System.out.println(mc2.get());

        new Thread(() -> mc1.add(100)).start();
        new Thread(() -> mc1.dec(100)).start();

        new Thread(() -> mc2.dec(100)).start();
        new Thread(() -> mc2.add(100)).start();

        System.out.println(mc1.get());
        System.out.println(mc2.get());
    }
}

class MyCounter {
    private int count = 0;
    // 当我们锁住的是this实例时，实际上也可以用synchronized修饰这个方法。以下两种方法是等价的
//    public void add(int n) {
//        synchronized(this) {
//            count += n;
//        }
//    }
    public synchronized void add(int n) {
        count += n;
    }
//    因此，用synchronized修饰的方法就是同步方法，它表示整个方法都必须用this实例加锁。

//    public void dec(int n) {
//        synchronized(this) {
//            count -= n;
//        }
//    }

    public synchronized void dec(int n) {
        count -= n;
    }

    public int get() {
        return count;
    }
}
