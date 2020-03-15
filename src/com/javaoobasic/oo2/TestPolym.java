package com.javaoobasic.oo2;

/**
 * 测试多态
 *
 * @author maxu
 */
public class TestPolym {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);

        Animal d = new Dog(); // 向上自动转型
        animalCry(d);

        Animal c = new Cat();
        animalCry(new Cat());

        Dog d2 = (Dog) d;
        d2.seeDoor();

        // Dog d3 = (Dog) c;
        // d3.seeDoor();
    }
    static void animalCry(Animal a) {
        a.shout();
    }

    /*
    static void animalCry(Dog d) {
        d.shout();
    }
    static void animalCry(Cat c) {
        c.shout();
    }
    */
}

class Animal {
    public void shout() {
        System.out.println("叫");
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪");
    }
    public void seeDoor() {
        System.out.println("看门");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵");
    }
}