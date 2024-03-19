package com.yt.IO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class test_Outputstream {
    public static void main(String[] args) throws Exception{
        String URL = "D:\\Java_Project\\Java_Basic\\src\\com\\yt\\IO\\1.txt";
        OutputStream output = new FileOutputStream(URL);
        output.write(44);
        output.write(1);
        output.write(67);
        output.close();
    }
}
