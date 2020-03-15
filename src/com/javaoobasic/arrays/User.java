package com.javaoobasic.arrays;

public class User {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
