package com.yt.encryptionandsecurity;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hash_algorithm {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        /*Java标准库提供了常用的哈希算法，并且有一套统一的接口。我们以MD5算法为例，看看如何对输入计算哈希：*/

        // 创建一个MessageDigest实例
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 反复调用 update 输入数据
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte [] result = md.digest();   // 16 bytes
        System.out.println(new BigInteger(1, result).toString(16));

        // SHA-1算法
        MessageDigest md2 = MessageDigest.getInstance("SHA-1");
        // 反复调用 update 的输入数据
        md2.update("Hello".getBytes("UTF-8"));
        md2.update("World".getBytes("UTF-8"));
        byte [] result2 = md2.digest();
        System.out.println(new BigInteger(1, result2).toString(16));
    }
}
