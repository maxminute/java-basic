package com.javabagin.control.loop;

/**
 * 测试递归
 *
 * @author maxu
 */
public class TestRecursion1 {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果:%s", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时: %s", d2 - d1);
        System.out.printf("%d循环的结果:%s", 10, factorialLoop(10));
    }

    /**
     * 求阶乘的方法
     * @param n
     * @return
     */
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * 循环求阶乘的方法
     * @param n
     * @return
     */
    static long factorialLoop(int n) {
        long d3 = System.currentTimeMillis();
        long result = 1;
        while (n > 1) {
            result *= n * (n - 1);
            n -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.printf("普通循环费时：%s", d4 - d3);
        return result;
    }
}
