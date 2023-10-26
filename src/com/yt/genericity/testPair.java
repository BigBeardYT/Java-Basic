package com.yt.genericity;

import java.lang.reflect.Field;

public class testPair {


    public static void main(String[] args) throws Exception {
        Pair<String> p = new Pair<>("zhangsan", "beijing");
        Pair p2 = Pair.create("wang", "wu");
        System.out.println(p2.toString());

        System.out.println(p.toString());

        Pair<Integer> p3 = new Pair<>(123, 456);
        System.out.println(p == p2);

        Class cls1 = p.getClass();
        Class cls2 = p3.getClass();
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls1 == cls2);

//        Field[] fields = cls1.getFields();
//        for (Field field : fields) {
//            System.out.println("field: " + field.getClass());
//        }
        Field field = cls1.getField("first");
        System.out.println(field);



    }

}
