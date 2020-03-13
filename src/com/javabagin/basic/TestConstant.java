package com.javabagin.basic;

/**
 * 测试常量
 * @author maxu
 */
public class TestConstant {
    public static void main(String[] args) {
        int age = 10;
        final String NAME = "Test";
        final double PI = 3.14;
        // PI = 3.15; //编译错误，不能再被赋值！
        double r = 4;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println("area=" + area);
        System.out.println("circle=" + circle);
    }
}
