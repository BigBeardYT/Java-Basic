package com.yt.intro;

public class testPerson {
    public static void main(String[] args) {
        Person p = new Person();
//        System.out.println(p.getString());
        System.out.println(p instanceof Person p1);
        p.setName("Zhangsan");
        p.setAge(18);
        System.out.println(p.name);

        Person p2 = new Person("Lisi", 20);
        // 在Person类中重写了toString方法，如果不重写，会直接调用父类中的getClass().getName() + ‘@’ + Integer.toHexString(hashCode())
        // 这种类似的输出：xxxx@xxxxxxx的类名加地址形式，如果在子类重写了，那输出对象时会直接调用重写后的toString方法，用来方便输出一些自己认为有用的东西，
        // 总之，它只是sun公司开发java的时候为了方便所有类的字符串操作而特意加入的一个方法
        System.out.println(p);
        // 但是，虽然调用了这个方法，如果不显示的自己调用的话，它返回的只是一个对象，比如将它和使用toString的方法与输出的字符串比较
        boolean a = p.equals("name: Zhangsan, age: 18");
        boolean b = p.toString().equals("name: Zhangsan, age: 18");
        System.out.println("与直接调用的p比较结果: " + a);
        System.out.println("与使用p调用toString()方法的结果: " + b);

        System.out.println(p2);

    }
}
