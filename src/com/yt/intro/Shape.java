package com.yt.intro;

public sealed class Shape permits Rect, Circle, Triangle {
    // sealed： 用来修饰特定的可以被继承的类，与permits合用，并通过permits明确写出能够从该class继承的子类的名称
    // 同时要注意：继承的子类必须要使用final来修饰，防止被继承
    // 这种sealed类主要用于一些框架，防止继承被滥用。
    protected int weight;
    protected int height;

    public Shape(){}


}
