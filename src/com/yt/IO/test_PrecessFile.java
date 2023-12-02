package com.yt.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Objects;

public class test_PrecessFile {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        File f = new File("D:\\Java_Project\\Java_Basic\\src\\com\\yt\\IO\\1.txt");
        File f1 = new File(".\\1.txt");

        System.out.println(f.isFile());
        System.out.println(f1.isFile());
        String time = String.valueOf(LocalTime.now());
        File f2 = File.createTempFile("tmp-", ".txt");  // 临时文件的文件名和后缀
        f2.deleteOnExit();  // JVM退出时自动删除
        System.out.println(f2.isFile());
        System.out.println(f2.getAbsolutePath());

        System.out.println("*************** 遍历一个文件夹 ********************");
        String url = "D:\\Java_Project\\Java_Basic";
        System.out.println("遍历的文件夹是: " + url);
        TraverseFile(url);

    }

    public static void TraverseFile(String url) {
        File f = new File(url);
        File [] files = f.listFiles();

        PrintFiles(url);
    }

    static void PrintFiles(String url) {
//        System.out.println("---------------");
        File file = new File(url);
        File [] files = file.listFiles();
        int blank = 0;

        if(files != null) {
            for(File f : files) {
                for(int i = 0;i < blank;i++) {
                    System.out.println("\t");
                }
                System.out.println(f);

                blank++;
                PrintFiles(f.toString());
                blank--;
            }
        }

    }
}
