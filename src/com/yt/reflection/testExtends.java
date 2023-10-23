package com.yt.reflection;

public class testExtends {
    /*
    当我们获取到某个Class对象时，实际上就获取到了一个类的类型：
    1.
    Class cls = String.class; // 获取到String的Class
    2.
    还可以用实例的getClass()方法获取：
    String s = "";
    Class cls = s.getClass(); // s是String，因此获取到String的Class
    3.
    最后一种获取Class的方法是通过Class.forName("")，传入Class的完整类名获取：

    Class s = Class.forName("java.lang.String");
    这三种方式获取的Class实例都是同一个实例，因为JVM对每个加载的Class只创建一个Class实例来表示它的类型。
     */
    public static void main(String[] args) {
        // 获取父类的class
        Class i = Integer.class;
        Class c = i.getSuperclass();
        System.out.println(c);
        Class c2 = c.getSuperclass();
        System.out.println(c2);
        System.out.println(c2.getSuperclass());

        // 接口,getInterfaces()只返回当前类直接实现的接口类型，并不包括其父类实现的接口类型：
        Class [] is = i.getInterfaces();
        for(Class ii : is) {
            System.out.println(ii);
        }

        Object o = 123;
        System.out.println(o.getClass().getName());
    }
}
