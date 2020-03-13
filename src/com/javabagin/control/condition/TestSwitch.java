package com.javabagin.control.condition;

/**
 * 测试switch语句，遇到多值判断的时候，使用switch。当然，switch完全可以用ifelseifelse代替
 *
 * @author maxu
 */
public class TestSwitch {
    public static void main(String[] args) {
        int month = (int)(12 * Math.random() + 1);
        System.out.println("月份：" + month);
        switch (month) {
            case 1:
                System.out.println("一月份");
                break;
            case 2:
                System.out.println("二月份");
                break;
            default:
                System.out.println("我是其他月份");
                break;
        }
        System.out.println("#######################");
        char c = 'a';
        int rand = (int)(26 * Math.random());
        char c2 = (char)(c + rand);
        System.out.print(c2 + ":");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音字母");
                break;
            case 'w':
            case 'y':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
                break;
        }
    }
}
