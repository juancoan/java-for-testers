package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


import java.sql.SQLOutput;

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

    public void makeNoise() {
        System.out.println("Meaaaaoowwww!!! Meaaaaowwww");
    }

    public void feed(String food) {
        System.out.println(name + " eats " + food);

    }

    public void groom() {
        cleansFur(); //if I create this method inside another one like this and choose the create method option it will create it private
        licksPaws();
    }

    private void licksPaws() {
        System.out.println(name + " is licking its paws.");
    }

    private void cleansFur() {
        System.out.println(name + " is cleaning its fur.");
    }
}
