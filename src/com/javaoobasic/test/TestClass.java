package com.javaoobasic.test;

/**
 * 测试类的创建
 *
 * @author maxu
 */

class Student {
    // 属性Fields
    int id;
    String sname;
    int age;
    Computer comp;

    // 方法
    void study() {
        System.out.println("我在认真学习！使用电脑：" + comp.brand);
    }

    void play() {
        System.out.println("我在玩游戏！王者荣耀！");
    }

    // 构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创建。
    Student() {
        System.out.println("调用了无参的构造方法！");
    }
}

class Computer {
    String brand;
}

public class TestClass {
    public static void main(String[] args) {
        Student stu = new Student(); // 创建一个对象
        stu.id = 1001;
        stu.sname = "老马";
        stu.age = 18;
        Computer c1 = new Computer();
        c1.brand = "联想";
        stu.comp = c1;
        stu.study();
        stu.play();
    }
}
