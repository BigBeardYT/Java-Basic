package com.yt.genericity;

import java.lang.reflect.Constructor;

public class testGenerAndRef {
    public static void main(String[] args) throws Exception {
        Class<String> stringClass = String.class;
//        class clazz = String.class;
        String str = (String) stringClass.newInstance();
        str = "sdlfkj";
        System.out.println(str);
        Class<Integer> clazz = Integer.class;
        Constructor<Integer> cons = clazz.getConstructor(int.class);
        Integer i = cons.newInstance(123);
        System.out.println(cons);
        System.out.println(i);
        // 可以声明带泛型的数组，但是不能new操作符创建带泛型的数组，如ps2

        Pair<String> [] ps = null;
//        Pair<String> [] ps1 = new Pair[];
        // 必须通过强制转型实现带泛型的数组
        @SuppressWarnings("unchecked")
        Pair<String> [] ps2 = (Pair<String>[]) new Pair[2];


    }
}
