package com.yt.encryptionandsecurity;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Base64;

public class Symmetric_entryption_Algorithm {
    /**
     * 对称加密算法就是传统的用一个密码进行加密和解密。例如，我们常用的WinZIP和WinRAR对压缩包的加密和解密，就是使用对称加密算法
     * @param args
     */
    public static void main(String[] args) throws Exception {
            // AES 算法
        // 原文
        String message = "Hello World";
        System.out.println("Message: " + message);
        // 128 位密钥 = 16 bytes key:
        byte [] key = "1234567890abcdef".getBytes("UTF-8");
        // 加密
        byte [] data = message.getBytes("UTF-8");
        byte [] encrypted = encrypt(key, data);
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(encrypted));
        // 解密：

    }

    // 加密
    private static byte[] encrypt(byte[] key, byte[] input) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCSSPadding");
        SecretKey keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(input);

    }
}
