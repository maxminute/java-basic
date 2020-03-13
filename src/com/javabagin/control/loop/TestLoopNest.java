package com.javabagin.control.loop;

/**
 * 测试嵌套循环
 *
 * @author maxu
 */
public class TestLoopNest {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("##########################");
        // 打印99乘法表： 1*1=2 2*2=4
        for (int n = 1; n <= 9; n++) {
            for (int m = 1; m <=n; m++) {
                System.out.print(m + "X" + n + "=" + (m * n) + "\t");
            }
            System.out.println();
        }
        System.out.println("##########################");
        // 用while循环分别计算100以内的奇数及偶数的和，并输出
        int sum01 = 0; // 奇数和
        int sum02 = 0; // 偶数和
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 偶数
                sum02 += i; // sum02 = sum02 + i;
            } else { // 奇数
                sum01 += i;
            }
        }
        System.out.println("奇数和：" + sum01);
        System.out.println("偶数和：" + sum02);
        System.out.println("##########################");
        // 用while循环或者其他循环输出1-1000之间能被5整除的数，且每行输出5个
        int h = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                h++;
            }
            if (h == 5) {
                System.out.println();
                h = 0;
            }
            /*
            if(i % 25 == 0) {
                System.out.println();
            }
             */
        }
    }
}
