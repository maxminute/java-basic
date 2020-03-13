package com.javabagin.basic;

import java.math.BigDecimal;

/**
 * 测试浮点型
 *
 * @author maxu
 */
public class TestFloatDataType {
    public static void main(String[] args) {
        float a = 3.14F;
        double b = 6.28;
        double c = 628E-2;
        System.out.println(c);
        // 浮点数是不精确的，一定不要用于比较
        float d1 = 423432423F;
        float d2 = d1 + 1;
        if (d1 == d2) {
            System.out.println("d1 == d2"); // 输出结果为 d1 == d2
        } else {
            System.out.println("d1 != d2");
        }
        System.out.println("########################");
        // 使用精确浮点运算，推荐：BigDecimal
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5000000000000001

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0 / 10.0);
        System.out.println(bd2.equals(bd3));
    }
}
