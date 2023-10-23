package com.yt.reflection;
import com.yt.intro.Person;
import com.yt.intro.Student;

import java.util.Arrays;

public class testgetFeild {
    public static void main(String[] args) throws Exception {
        Class stdClass = Students.class;
        // 获取Student实例中的字段“score”
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name"
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade"
        System.out.println(stdClass.getField("grade"));

    }


}


class Persons {
    public String name;
}

class Students extends Persons {
    public int score;
    public int grade;
}

