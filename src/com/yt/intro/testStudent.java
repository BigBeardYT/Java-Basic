package com.yt.intro;

public class testStudent {
    public static void main(String[] args) {
        Student s = new Student("WangXiao", 17, 93);
        System.out.println(s);

        /**
         * 向上转型
         *
         */
        // 如果引用的变量类型时Student，那么它可以指向一个Student类型的实例：
        Student s1 = new Student();
        // 如果引用类型的变量时Person, 那么它可以指向一个Person的实例：
        Person p1 = new Person();
        // 那么对于继承Person的Student类来说，一个引用类型为Person的变量，能否指向Student的实例呢
        Person p2 = new Student("WangWa", 15, 88);
        System.out.println(p2);
        /* 这是被允许的！ */
        // 甚至还可以转为Object
        Object obj = p2;

        System.out.println(obj);
        // 因为继承树为 Student -> Person -> Object, 所以可以把Student类型转型为Person, 或者更高层次的Object

        /** 向下转型
         *
         */
        // 反过来，引用类型时子类的Student，能否指向Person的实例呢？
        Student s2 = (Student) p2;      // OK
//        String s3 = (Student) p1;    // ERROR
//        Student s2 = new Person();    // ERROR
        /* 显然，这是不行的，相反与父亲可以指挥儿子，但是儿子不能指挥父亲，因为儿子通过父亲而来，
        他有的方法父类的实例对象中不一定有，总不可能凭空产生, 失败的时候，Java虚拟机会报ClassCastException。*/

        /**
         * 为了避免向下转型出错，Java中可以使用 instanceof 操作符
         * 可以先判断一个实例究竟是不是某种类型，Boolean类型
         * 即判断一个new出来的对象是不是某个类，或者从属于某个类的子类
         */
        System.out.println("************* instanceof 操作符 *************");
        Student s4 = new Student();
        System.out.println(s4 instanceof Student);  // true
        System.out.println(s4 instanceof Person);   // true

        Person p4 = new Person();
        System.out.println(p4 instanceof Student);  // false
        System.out.println(p4 instanceof Person);   // true

        Student n = null;
        System.out.println(n instanceof Student);   // false

        // instanceof判断一个实例是否为某一个类型，或者这个类型的子类，如果一个引用变量为null， 那么对任何instanceof都返回false
        // 利用这个特点，在向下转型的时候可以这样判断
        if (p2 instanceof Student) {
            // true可以转型
            Student s5 = (Student) p2;  // 一定会转型成功
        }
        // 或者这样写
        Object obj1 = "hello world";
        if (obj1 instanceof String str) {
            System.out.println(str.toUpperCase());
        }






    }
}
