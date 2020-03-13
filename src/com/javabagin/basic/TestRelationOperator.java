package com.javabagin.basic;

/**
 * 测试关系运算符
 *
 * @author maxu
 */
public class TestRelationOperator {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a == 3); // true
        System.out.println(a != 3); // false
        System.out.println(a < 5); // true

        char b = 'a';
        char b2 = 'c';
        System.out.println((int)b); // 97
        System.out.println(0 + b); // 97
        System.out.println(0 + b2); // 99
        System.out.println(b < b2); // true
    }
}
