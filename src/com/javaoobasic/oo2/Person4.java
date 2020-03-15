package com.javaoobasic.oo2;

public class Person4 {
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("请输入正常的年龄");
        }
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    private boolean man;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return man;
    }
}
