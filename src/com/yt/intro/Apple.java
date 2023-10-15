package com.yt.intro;

public class Apple extends Fruit{

    @Override
    public void run() {
        System.out.println("Apple.run()");
    }
    @Override
    public String toString() {
        return "水果: " + name + ", 年份: " + year;
    }
}
