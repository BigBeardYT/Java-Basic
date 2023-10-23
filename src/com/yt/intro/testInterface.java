package com.yt.intro;

import java.lang.reflect.Method;

public class testInterface {
    public static void main(String[] args) throws Exception{
//        Class cls = Stu.class;
//        Method m = cls.getMethod("getName");
//        String s = (String) m.invoke(new Stu(), "zhangsan");
//
//
//        System.out.println(s);
        Stu s = new Stu("zhangsan");
        s.run();
//        System.out.println(s.getName());


    }
}

interface Person4 {
    String getName();

    /**
     * default 修饰方法时只能在接口类中使用，在接口中被 default 标记的方法可以直接写方法体，而无需修改所有实现了此接口的类。
     * 我们都知道 Java 中的接口是用来实现的，接口中是没有实现的方法。
     *
     * 使用 default 关键字可以打破这个限制，当定义了一个接口，但是我们接口中的方法用了 default 关键字，我们就可以在这个方法中进行实现了。
     *
     * 这时，我们不需要再定义一个实现类类实现接口中的所有方法。
     */
    default void run() {
        System.out.println(getName() + ", default run");
    }

}

class Stu implements Person4 {
    private String name;
    public Stu() {

    }
    public Stu(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
