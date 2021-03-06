package com.javaoobasic.test;

public class TestThis {
    int a, b, c;

    TestThis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    TestThis(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    void sing() {
        System.out.println("TestThis.sing()");
    }

    void eat() {
        this.sing(); // 调用本类中的sing();
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        hi.eat();
    }
}
