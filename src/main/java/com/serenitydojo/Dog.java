package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


public class Dog{
    private static final String DOG_NOISE = "Rrrrufff Rrrrufff";
    private String name;
    private String favouriteToy;
    private Integer age;

    public Dog(String name, String favouriteToy, int age) { //constructor
        this.name=name;
        this.age = age;
        this.favouriteToy = favouriteToy;
    }


    public String getfavouriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }
}
