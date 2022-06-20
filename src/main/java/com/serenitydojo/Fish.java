package com.serenitydojo;

//classes have fields, are abstract, like Dog, have properties like name, age
//objects represent real things like Numa the dog have values for the properties, name Numa, age 10s


//import sun.security.krb5.internal.PAEncTSEnc;

public class Fish extends Pet {
    private static final String FISH_NOISE = "Blooop, blooop!";
    public String favouriteGame;

    public Fish(String name, Integer age) { //constructor
        super(name, age);
    }


    public void setfavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }

    public String getfavouriteGame() {
        return favouriteGame; // it will return a string, the GAME
    }

    public String makeNoise() {//when using return  specify the method what it returns.
        return FISH_NOISE;
        //System.out.println("Meaaaaoowwww!!! Meaaaaowwww");
    }

    public String play(){
        return "Plays with bubble.";
    }
}
