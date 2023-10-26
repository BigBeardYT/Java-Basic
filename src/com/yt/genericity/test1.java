package com.yt.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        /**
         * 了解什么是泛型之前，我们先观察Java标准库提供的ArrayList，它可以看作“可变长度”的数组，因为用起来比数组更方便。
         * 实际上ArrayList内部就是一个Object[]数组，配合存储一个当前分配的长度，就可以充当“可变数组”：
         */
        ArrayList list = new ArrayList();
        list.add("hello");
        /*
        如果用上述ArrayList存储String类型，会有这么几个缺点：
        需要强制转型；
        不方便，易出错。
         */
        String s = (String) list.get(0);

        list.add(new Integer(123));

        Integer n2 = (Integer) list.get(1);
        System.out.println(s);
        System.out.println(n2);


    }
}
