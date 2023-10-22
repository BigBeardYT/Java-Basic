package com.yt.exception;

public class testAssert {
    public static void main(String[] args) {
        double x = -1;
//        double x = Math.ceil(-123.56);
        assert x >= 0;
        System.out.println(x);

    }
}
