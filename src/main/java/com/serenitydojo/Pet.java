package com.serenitydojo;

public class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {//constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
