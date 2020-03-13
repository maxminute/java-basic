package com.javabagin.basic;

/**
 * 测试算数运算符
 *
 * @author maxu
 */
public class TestCountOperator {
    public static void main(String[] args) {
        /*
        byte a = 1;
        int b = 2;
        long b2 = 3;
        // byte c = a + b; // 报错
        // int c2 = b2 + b; // 报错
        float f1 = 3.14F;
        float d = b + b2;
        // float d2 = f1 + 6.2; // 报错
        System.out.println(-9 % 5);
        */

        // 测试自增资减
        int a = 3;
        int b = 4;
        a += b; // 相当于 a = a + b
        System.out.println("a=" + a + "\nb=" + b); // 7 4
        a = 3;
        a *= b + 3; // 相当于 a = a * (b + 3)
        System.out.println("a=" + a + "\nb=" + b); // 21 4
    }
}
