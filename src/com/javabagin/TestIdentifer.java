package com.javabagin;

/**
 * 测试标识符的用法
 *
 * @author maxu
 */
public class TestIdentifer {
    public static void main(String[] args) {
        int a123 = 1;
        // int 123abc = 2; //不能以数字开头
        int $a = 3;
        int _abc = 4;
        // int #abc = 5;
        int 年龄 = 18; // 可以使用汉子，但一般不建议
        // int class = 2; // 关键字不能作为标识符
    }
}
