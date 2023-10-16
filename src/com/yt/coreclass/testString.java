package com.yt.coreclass;

public class testString {
    public static void main(String[] args) {
        String s = new String(new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println(s.toString());
        String s1 = "HELLO";
        String s2 = "HELLO";

        System.out.println(s1 == s2);   // true
        System.out.println(s1.equals(s2));  // true
        // Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。


        String s3 = new String("HELLO");
        String s4 = "hello";
        String s5 = s1.toLowerCase();
        System.out.println(s1 == s3);   // false
        System.out.println(s1.equals(s3));  // true
        System.out.println(s4 == s5);   // false
        System.out.println(s4.equals(s5));  // true



    }
}
