package com.yt.IO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test_Path {
    public static void main(String[] args) {
        Path p1 = Paths.get(".", "project", "study");
        System.out.println(p1);
        System.out.println(p1.isAbsolute());
        Path p = Paths.get("D:\\", "Java_Project", "Java_Basic\\src\\com\\yt\\IO", "1.txt");
        System.out.println(p.getRoot());
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        // 转化为规范路径
        Path p3 = p1.normalize();
        System.out.println(p3);
        // 转换为File对象
        File f = p.toFile();
        System.out.println(f.isFile());
        // 直接遍历path
        for(Path path : Paths.get("..").toAbsolutePath()) {
            System.out.println(" " + path);
        }
    }
}
