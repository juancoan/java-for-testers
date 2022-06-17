package com.serenitydojo;

public abstract class Pet {

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


    public abstract String makeNoise(); //this method is also on Pet, Dog, Cat methods, all used individually.
     //   return "UNKNOWN sound/noise.";
/* When a method is set as ABSTRACT it means that it is generic for all classes and also it has to be definedbut without anything inside it.
Also the class has to be set as ABSTRACT and because of this the class can only be of subtype (hamster, dog, cat, fish etc.)
and also each child class has to have it's defined method on the class with the sound, only on the Father, should be like this public abstract String makeNoise();
and on the children public abstract String makeNoise(){ whatever code you need};*/


}
