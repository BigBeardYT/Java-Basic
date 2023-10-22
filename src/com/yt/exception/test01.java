package com.yt.exception;

public class test01 {
    public static void main(String[] args) throws Exception {
//        process1();
        Exception origin = null;
        try {
            Integer.parseInt("abc");

        } catch (Exception e) {
//            System.out.println("catched");
//            throw new RuntimeException(e);
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            if(origin != null) {
                e.addSuppressed(origin);

            }
            throw e;
        }
    }

    static void process1() {
        try{
            process2();
        }catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static  void process2() {
        throw new NullPointerException();
    }
}
