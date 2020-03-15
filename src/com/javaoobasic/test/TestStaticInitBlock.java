package com.javaoobasic.test;

/**
 * 测试静态初始化块的作用
 *
 * @author maxu
 */

class User3 {
    int id;
    String name;
    String pwd;
    static String company;

    static {
        System.out.println("执行类的初始化工作");
        company = "北京大学";
        printCompany();
    }

    public User3() {
        System.out.println("执行类的默认初始化工作");
    }

    private static void printCompany() {
        System.out.println(company);
    }

}

public class TestStaticInitBlock {
    public static void main(String[] args) {
        User3 u3 = new User3();
    }
}
