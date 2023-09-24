package com.yt.intro;

import java.util.Scanner;

public class BMI_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的身高(m): ");
        double height = sc.nextDouble();
        if (height > 100){
            height = height / 100;
        }
        System.out.println();
        System.out.print("请输入你的体重(kg): ");
        double weight = sc.nextDouble();
        // 计算BMI指数
        double bmi = Cal(height, weight);
//        System.out.print("您的BMI指数为:");
        // 格式化输出，
        System.out.printf("您的BMI指数为: %.2f\n", bmi);
        if(bmi < 18.5){
            System.out.println("您的BMI指数比较低，建议平时适当多吃");
        }else if(bmi >= 18.5 && bmi <= 25){
            System.out.println("您的身材保持得很不错！");
        }else if(bmi > 25 && bmi <= 28){
            System.out.println("该减肥了！");
        }else if(bmi > 28 && bmi <= 32) {
            System.out.println("有点偏肥胖了，注意饮食，减肥！");

        }else {
            System.out.println("不健康了!速速减肥!");
        }


    }
    public static double Cal(double h, double w){
        double res = w / (Math.pow(h, 2));
        return res;

    }
}
