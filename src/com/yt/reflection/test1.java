package com.yt.reflection;

import com.sun.tools.javac.Main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

public class test1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        String s = "hello";
//        Class cls1 = s.getClass();
//        Class cls2 = String.class;
//        boolean sameClass = cls2 == cls1;
//        String s2 = "world";
//        Class cls3 = s2.getClass();
//        boolean sameClass2 = cls3 == cls1;
//        System.out.println(sameClass2);
//
//        System.out.println("cls == cls2 ? " + sameClass);
//
//        System.out.println(cls1.isPrimitive());
//
//        // Class实例比较和instanceof的差别
//        Integer n = 123;
//        boolean b1 = n instanceof Number;
//        boolean b2 = n instanceof Integer;
//        System.out.println(b1);
//        System.out.println(b2);
//        boolean b3 = n.getClass() == Integer.class;
////        boolean b4 = n.getClass() == Number.class;    // 不可比较，一个是Number，一个是其子类Integer
//        System.out.println(b3);
//        System.out.println(b4);

//        // 获取String的class实例
//        Class cls = String.class;
//        // 创建一个String实例
//        String s = (String)cls.newInstance();
//        System.out.println(s);
        Logger factory = null;
        if(isClassPresent("org.apache.logging.log4j.Logger")) {
            factory = (Logger) createLog4j();
        } else {
            factory = createJdkLog();
        }
    }

    static Log createLog4j() {
        Log log = LogFactory.getLog(Main.class);
        return log;
    }
    static Logger createJdkLog() {
        Logger log = Logger.getLogger(Main.class.getName());
        return log;
    }

    static boolean isClassPresent(String name) {
        try {
            Class.forName(name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
