package com.javabagin.basic;

/**
 * 测试基本数据类型（整型变量）
 *
 * @author maxu
 */
public class TestBasicDataType {
    public static void main(String[] args) {
        // 测试整型变量
        int a = 15;
        int b = 015; // 以0开头是八进制
        int c = 0x15; // 以0x开头是十六进制
        int d = 0b1101; // 以0b开头的是二进制
        System.out.println(b); // 12
        System.out.println(c); // 21
        System.out.println(d); // 13

        byte age = 30;
        short salary = 30000;
        int population = 2000000000; // 整型常量默认是int类型
        long globalPopulation = 7400000000L; // 后面加L就是这是一个long类型的常量
    }
}
