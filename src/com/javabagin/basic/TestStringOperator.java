package com.javabagin.basic;

/**
 * 测试字符串运算符
 *
 * @author maxu
 */
public class TestStringOperator {
    public static void main(String[] args) {
        String a = "3";
        int b = 4;
        int c = 5;
        char d = 'a';
        System.out.println(a + b + c); // 345
        System.out.println(b + c + a); // 93;
        System.out.println(d + 4); // 101 97 + 4 = 101
    }
}
