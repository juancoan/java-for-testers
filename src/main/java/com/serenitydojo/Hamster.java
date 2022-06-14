package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


//import sun.security.krb5.internal.PAEncTSEnc;

public class Hamster extends Pet {
    public String favouriteGame;

    public Hamster(String name, Integer age){ //constructor
        super(name, age);
    }


    public void setfavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }

    public String getfavouriteGame() {
        return favouriteGame; // it will return a string, the food
    }

}
