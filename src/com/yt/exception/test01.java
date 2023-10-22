package com.yt.exception;

public class test01 {
    public static void main(String[] args) {
        process1();
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
