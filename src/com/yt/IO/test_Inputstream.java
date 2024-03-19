package com.yt.IO;

import java.io.*;
import java.util.Scanner;

public class test_Inputstream {
    public static void main(String[] args) throws Exception{
        System.out.println("自定义输入:");
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine();
        while((sc.nextLine()) != null) {
            System.out.println(sc.nextLine());
        }
        System.out.println(sin);
        System.out.println("自定义输入结束...");

//        readFile();
        byte [] data = {87, 43, 108, 127};
        try(InputStream inputStream = new ByteArrayInputStream(data)) {
            int n;
            while((n = inputStream.read()) != -1) {
                System.out.println((char)n);
            }
        }
        String URL = "D:\\Java_Project\\Java_Basic\\src\\com\\yt\\IO\\1.txt";
        String s = "";
        String s2;
        try(InputStream inputStream = new FileInputStream(URL)) {
            int n;
            s2 = readAsString(inputStream, URL);
            StringBuilder sb = new StringBuilder();
            while((n = inputStream.read()) != -1) {
                sb.append((char)n);
            }
            s = sb.toString();

        }
        System.out.println("********** s ************");
        System.out.println(s);
        System.out.println("-----------s2---------------");
        System.out.println(s2);
    }
    public static String readAsString(InputStream inputStream, String URL) throws Exception {
        int n;
        StringBuilder sb = new StringBuilder();
        while((n = inputStream.read()) != -1) {
            sb.append((char)n);
        }
        return sb.toString();
    }
    public static void readFile() throws IOException {
        // 创建一个FileInputstream对象D:\Java_Project\Java_Basic\src\com\yt\IO
        String URL = "D:\\Java_Project\\Java_Basic\\src\\com\\yt\\IO\\1.txt";
//        InputStream inputStream = null;
//        try(InputStream inputStream = new FileInputStream(URL)) {
//            while(true) {
//                int n = inputStream.read();
//                if(n == -1) {
//                    break;
//                }
//                System.out.println(n);
//            }
//        }   // 这种写法会自动，实际上，编译器只看try(resource = ...)中的对象是否实现了java.lang.AutoCloseable接口，如果实现了，
        // 就自动加上finally语句并调用close()方法。InputStream和OutputStream都实现了这个接口，因此，都可以用在try(resource)中。
//        System.out.println(inputStream.read());
//        while(true) {
//            int n = inputStream.read();
//            if(n == -1) {
//                break;
//            }
//            System.out.println(n);
//        }
//        inputStream.close();
        try(InputStream inputStream = new FileInputStream(URL)) {
            byte [] buffer = new byte[1000];
            int n;
            while((n = inputStream.read(buffer)) != -1) {
                System.out.println("read" + n + "byte.");

            }
        }
    }
}
