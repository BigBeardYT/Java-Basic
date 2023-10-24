package com.yt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 表示注解的使用范围，在编译期、Class期或者RunTime期
@Target(ElementType.FIELD)  // 表示给字段、类或方法使用的注解
public @interface Range {
    /**
     * 自定义注解，我们希望用这个注解来定义一个String字段的规则：字段长度满足@Range的参数定义
     *
     */
    int min() default 0;
    int max() default 255;
}
