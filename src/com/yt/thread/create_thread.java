package com.yt.thread;

public class create_thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread start ...");
//        Thread thread = new Thread(new MyThread());
//        thread.start(); // 启动新线程
//        System.out.println("close the thread");
//        System.out.println("----------------------");
//
//        // lambda 语法
//        Thread thread1 = new Thread(() -> {
//            System.out.println("start my second thread!");
//        });
//        thread1.start();
//        System.out.println("----------------------");

        // 或者直接在括号后面接
        Thread thread2 = new Thread() {
          public void run() {

              System.out.println("my third thread run ...");
              try {
                  Thread.sleep(5000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              System.out.println("my third thread end...");
          }
        };
        thread2.start();
        thread2.join(3000);     // join()方法，等待调用它的线程结束后再往下执行
        // 此外，join(long)的重载方法也可以指定一个等待时间，超过等待时间后就不再继续等待。
        System.out.println("main thread end...");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start my thread!");
    }
}