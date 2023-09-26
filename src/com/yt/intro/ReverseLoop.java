package com.yt.intro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseLoop {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 4, 8, 9, 23};
        System.out.println("正序输出数组，3种方法");
        System.out.println("第一种方法");
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n第二种方法");
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("\n第三种方法");
        System.out.println(Arrays.toString(arr));

        //
        System.out.println("倒序遍历");
        for(int i = arr.length - 1;i >= 0;i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
