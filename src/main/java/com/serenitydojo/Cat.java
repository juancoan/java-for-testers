package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


public class Cat {
    public String name;
    public String favouriteFood;
    public int age;

    public void setName(String name) {
        this.name=name;//this is to refer to the variable.
    }

    public String getName() {
        return name; // it will return a string, the name

    }

    public void setfavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getfavouriteFood() {
        return favouriteFood; // it will return a string, the food


    }

    public void setAge(int age) {
        this.age=age;
    }

    public Integer getAge() {
        return age;

        }

    }
