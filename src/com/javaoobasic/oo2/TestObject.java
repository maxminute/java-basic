package com.javaoobasic.oo2;

public class TestObject {
    public static void main(String[] args) {
        TestObject to = new TestObject();
        System.out.println(to.toString());

        Person2 p2 = new Person2("欢欢", 5);
        System.out.println(p2.toString());
    }
}

class Person2 {
    String name;
    int age;

    @Override
    public String toString() {
        return name + "，年龄：" + age;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}