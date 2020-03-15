package com.javaoobasic.arrays;

/**
 * 测试数组的三种初始化的方式
 *
 * @author maxu
 */
public class TestArray02 {
    public static void main(String[] args) {
        // 静态初始化
        int[] a = { 2, 4, 65 };
        User[] b = {
                new User(1001, "一"),
                new User(1002, "二"),
                new User(1003, "三")
        };
        // 默认初始化
        int[] c = new int[3]; // 默认给数组的元素进行赋值。赋值的规则和成员变量默认赋值规则一致。
        // 动态初始化
        int[] a1 = new int[2]; // 动态初始化数组，先分配空间
        a1[0] = 1; // 给数组元素赋值
        a1[1] = 2; // 给数组元素赋值
    }
}
