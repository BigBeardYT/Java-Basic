package com.yt.thread;

public class interrupt_thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread2();
        t.start();
        Thread.sleep(100); // 暂停1秒
        t.interrupt();  // 中断线程
        t.join();       // 等待t线程结束
        System.out.println("end ... ");

        // 使用标志位设置的方法终端线程
//        Thread t = new HelloThread2();
//        t.start();
//        Thread.sleep(1);
//        ((HelloThread2) t).running = false;
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        Thread hellothread = new HelloThread();
        hellothread.start();    // 启动Hello线程
        try {
            hellothread.join();
        } catch (InterruptedException e) {
            System.out.println("hellothread interrupt");
//            throw new RuntimeException(e);
        }
        hellothread.interrupt();
//        int n = 0;
//        if(!isInterrupted()) {
//            n++;
//            System.out.println("n = " + n);
//
//        }
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while(!isInterrupted()) {
            n++;
            System.out.println(n + "HelloThread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                break;
//                throw new RuntimeException(e);
//            }
        }
    }
}

class HelloThread2 extends Thread {
    public volatile boolean running = true;
    public void run() {
        int n = 0;
        while(running) {
            n++;
            System.out.println(n + "HelloThread");
        }
        System.out.println("hellothread2 end ...");
    }
}