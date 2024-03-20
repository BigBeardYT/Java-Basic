package com.yt.thread;

public class thread_synchronize {
    public static void main(String[] args) throws InterruptedException {
        var add = new AddThread();
        var dec = new DecThread();


            System.out.println(Counter.count);
            add.start();
            dec.start();
            add.join();
            dec.join();

            System.out.println(Counter.count);




    }
}

class Counter {
    // JVM只保证同一个锁在任意时刻只能被一个线程获取
    public static final Object lock = new Object();
    public static int count = 0;
    final int i = 1;

}

class AddThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 1000;i++) {
            synchronized(Counter.lock) {    // 获取锁
                Counter.count += i;
            }   // 释放锁

        }
    }
}

class DecThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 999;i++) {
            synchronized(Counter.lock) {    // 获取锁
                Counter.count -= i;
            }   // 释放锁

        }
    }
}