package com.yt.thread;

import java.util.TreeMap;

public class daemon_thread {
    /**
     * 守护进程
     * 守护线程是指为其他线程服务的线程。在JVM中，所有非守护线程都执行完毕后，无论有没有守护线程，虚拟机都会自动退出。
     * 因此，JVM退出时，不必关心守护线程是否已结束。
     * 如何创建守护线程呢？方法和普通线程一样，只是在调用start()方法前，调用setDaemon(true)把该线程标记为守护线程：

     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread run ...");
        Thread t = new Thread(() -> {
            while(true) {
                System.out.println("t被标记为了一个守护线程");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t.setDaemon(true);
        t.start();

        Thread.sleep(3000);
        System.out.println("main thread end ... ");

    }
}
