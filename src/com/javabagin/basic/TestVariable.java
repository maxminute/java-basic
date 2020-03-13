package com.javabagin.basic;

/**
 * 测试变量
 *
 * @author maxu
 */
public class TestVariable {
    int a; // 成员变量，从属对象：成员变量会自动被初始化
    static int size; // 静态变量，从属于类

    public static void main(String[] args) {
        {
            int age; // 局部变量，从属于语句块
            age = 18;
        }
        int salary = 3000; // 局部变量，从属于方法
        int gao = 13;
        System.out.println(gao);
        int i;
        // int j = i + 5;
    }
}
