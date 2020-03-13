package com.javabagin.control.loop;

/**
 * 测试循环语句中的break
 *
 * @author maxu
 */
public class TestBreak {
    public static void main(String[] args) {
        int total = 0; // 定义计数器
        System.out.println("Begin");
        while (true) {
            total++; // 每循环一次计数器加1
            int i = (int)Math.round(100 * Math.random());
            System.out.println(i);
            // 当i = 88时，退出循环
            if (i == 88) {
                break;
            }
        }
        // 输出循环的次数
        System.out.println("Game over, used " + total + " times.");
    }
}
