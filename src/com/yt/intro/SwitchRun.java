package com.yt.intro;

public class SwitchRun {
    public static void main(String[] args) {
        String fruit = "apple";
        // 第一种switch写法，（传统写法)
        switch (fruit) {
            case "banana":
                System.out.println("Selected banana");
                break;
            case "apple":
                System.out.println("Selected apple");
                break;
            case "pear":
                System.out.println("Selected pear");
                break;
            default:
                System.out.println("No fruit selected");
        }
        // Java12后的新写法
        switch (fruit) {
            case "banana" -> System.out.println("Selected banana");
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            default -> System.out.println("No fruit selected");
        }
        // 新的switch语法，不需要break，可以直接返回值，
        int opt = switch (fruit) {
            case "banana" -> 1;
            case "apple" -> 2;
            case "pear" -> 3;
            default -> 0;
        };  // 注意，因为时赋值语句，所以结束后有一个分号
        System.out.println("opt = " + opt);
        // 在switch表达式内部返回值 yield 关键字
        int opt2 = switch (fruit) {
            case "banana" -> 1;
            case "apple" -> 2;
            case "pear" -> 3;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch 返回语句值
            }
        };
        System.out.println("opt2 = " + opt2);
    }
}
