package com.javaoobasic.test;

/**
 * 测试参数传值机制
 *
 * @author maxu
 */

class User4 {
    int id;
    String name;
    String pwd;

    public User4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User4 u) {
        u.name = "小八";
    }

    public void testParameterTransfer02(User4 u) {
        u = new User4(200, "小三");
    }
}
public class TestParameter {
    public static void main(String[] args) {
        User4 u1 = new User4(100, "小七");
        u1.testParameterTransfer01(u1);
        System.out.println(u1.name);
        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}
