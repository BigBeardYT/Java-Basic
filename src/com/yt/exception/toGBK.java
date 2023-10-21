package com.yt.exception;

import java.io.UnsupportedEncodingException;

public class toGBK {
    public static void main(String[] args) {
        System.out.println(toGBK("HEllo"));
    }

    static byte[] toGBK(String s) {
        try {
            // 用指定的编码转换
            return s.getBytes("GBK");
        }catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
        return s.getBytes();
    }
}
