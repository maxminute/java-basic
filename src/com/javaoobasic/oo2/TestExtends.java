package com.javaoobasic.oo2;

/**
 * 测试继承
 *
 * @author maxu
 */
public class TestExtends {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        stu.name = "二";
        stu.height = 172;
        stu.rest();

        Student2 stu2 = new Student2("欢欢", 6, "小狗");
        System.out.println(stu2 instanceof Student2);
        System.out.println(stu2 instanceof Person);
        System.out.println(stu2 instanceof Object);
        System.out.println(new Person() instanceof Student2);
    }
}

class Person /* extends Object */ {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会儿");
    }
}

class Student2 extends Person {
    String major;

    public void study(){
        System.out.println("学习两个小时");
    }

    public Student2() {

    }

    public Student2(String name, int height, String major) {
        this.name = name;
        this.height = height;
        this.major = major;
    }
}