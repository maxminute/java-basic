package com.javaoobasic.oo1;

import com.javaoobasic.oo2.Human;

public class TestEncapsulation2 {
    public static void main(String[] args) {
        Human h = new Human();
        // h.age = 13;
        // h.name = "高大上"; // name为default属性，不能被不同包的类访问
        h.sayAge();
    }
}

class Girl extends Human {
    void sayGood() {
        System.out.println(height);
    }
}