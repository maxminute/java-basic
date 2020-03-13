package com.javabagin.control.method;

/**
 * 测试方法的基本使用
 *
 * @author maxu
 */
public class TestMethod {
    public static void main(String[] args) {
        // 通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printTest();
        int c = tm.add(30, 40, 50) + 1000;
        System.out.println(c);
    }

    void printTest() {
        System.out.println("北京");
    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        return sum; // return两个作用：1.结束方法的运行。2.返回值
    }
}
