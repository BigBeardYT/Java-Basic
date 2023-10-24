package com.yt.annotation;

import java.lang.reflect.Field;

public class checkAnnoInPerson {
    /**
     * 使用@Range注解来检查Java Bean的字段。如果字段类型是String，就检查String的长度，如果字段是int，就检查int的范围。
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        p.name = "zhangsan";
        p.city = "zhonghuarenminguoheguoguangdongshengzhuangdongshitianhequ";
        p.age = 20;

        Field [] fields = p.getClass().getFields();
        for(Field field : fields) {
            // 获取字段Field定义的@Range
            Range range = field.getAnnotation(Range.class);
            // 如何@Range存在
            if(range != null) {
                // 获取Field的值
                Object value = field.get(p);
                // 如果这个值是String
                System.out.println("field的值: " + value);
                if(value instanceof String) {
                    // 判断是否符合注解的范围
                    if(((String) value).length() < range.min() || ((String) value).length() > range.max()) {
                        System.out.println("Error, Invalid field");
                    } else {
                        System.out.println("Ok, Valid field");
                    }
                } else if(value instanceof Integer) {
                    // 判断是否符合注解的范围
                    if((Integer) value < range.min() || (Integer) value > range.max()) {
                        System.out.println("Error, Invalid field");
                    } else {
                        System.out.println("Ok, Valid field");
                    }
                }
            }
        }


    }
}
