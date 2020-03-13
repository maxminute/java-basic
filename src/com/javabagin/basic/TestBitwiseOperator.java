package com.javabagin.basic;

/**
 * 测试位运算符
 *
 * @author maxu
 */
public class TestBitwiseOperator {
    public static void main(String[] args) {
        int a = 3; // 0011
        int b = 4; // 0100
        System.out.println(a & b); // 0
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 7
        System.out.println(~a); // -4

        // 位移
        int c = 3 << 2; // 左移一位相当于乘以2
        System.out.println(c); // 12
        System.out.println(12 >> 1); // 6 右移一位相当于除以2
    }
}
