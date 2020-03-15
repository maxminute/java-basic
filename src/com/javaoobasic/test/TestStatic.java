package com.javaoobasic.test;

/**
 * 测试static关键字的用法
 *
 * @author maxu
 */

class User2 {
    int id;
    String name;
    String pwd;
    static String company = "北京大学";

    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        printCompany();
        System.out.println(company);
        System.out.println("登录：" + name);
    }

    public static void printCompany() {
        // login(); // 调用非静态成员，编译就会出错
        System.out.println(company);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        User2 u = new User2(101, "哈哈");
        User2.printCompany();
        User2.company = "阿里巴巴";
        User2.printCompany();
    }
}
