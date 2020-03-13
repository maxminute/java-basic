package com.javabagin.basic;

/**
 * 测试自动类型转换
 * @author maxu
 */
public class TestTypeConvert {
    public static void main(String[] args) {
        int a = 324;
        long b = a;
        double d = b;
        // a = b;
        // long e = 3.23f;
        float f = 234324L;
        // 特例
        byte b2 = 123;
    }
}
