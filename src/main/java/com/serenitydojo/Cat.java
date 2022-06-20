package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


//import sun.security.krb5.internal.PAEncTSEnc;

import java.sql.SQLOutput;

public class Cat extends Pet {
    public String favouriteFood;
    public static final String CAT_NOISE = "Meaaaaoowwww!!!";//final unchangable variable

    public Cat(String name, Integer age){ //constructor
        super(name, age);
    }


    public void setfavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getfavouriteFood() {
        return favouriteFood; // it will return a string, the food
    }


    @Override // to enforce the overriding of methods
    public String makeNoise() {//when using return  specify the method what it returns.
        return  CAT_NOISE;
        //System.out.println("Meaaaaoowwww!!!");
    }

    public void feed(String food) {
        System.out.println(getName() + " eats " + food);

    }

    public void groom() {
        cleansFur(); //if I create this method inside another one like this and choose the create method option it will create it private
        licksPaws();
    }

    private void licksPaws() {
        System.out.println(getName() + " is licking its paws.");
    }

    private void cleansFur() {
        System.out.println(getName() + " is cleaning its fur.");
    }


    public String play(){
        return "Plays with string.";
    }



}
