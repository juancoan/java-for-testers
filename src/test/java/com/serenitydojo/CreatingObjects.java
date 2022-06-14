package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

public class CreatingObjects{

    @Test
    public void Creating_A_Cat(){
        String name = "Reina";
        String favouriteFood = "Tuna";
        Integer age = 3;


        Cat Reina = new Cat("Reina", 5);

        System.out.println(Reina.getName());
        Reina.setfavouriteFood("Tuna");
        System.out.println(Reina.getfavouriteFood());
        System.out.println(Reina.getAge());


        //I can also do the getName2 method right click and choose create property(for the get/set methods but it involves creating
        // new variables for the name, etc or on the constructor can pass the variables, but create and define the constructor on the
        // main Cat class)

        Cat Reina2 = new Cat("Reinilla", 10);
        System.out.println(Reina2.getName());
        Reina2.setfavouriteFood("Fish");
        System.out.println(Reina2.getfavouriteFood());
        System.out.println(Reina2.getAge());
    }
    @Test
    public void Creating_A_Hamster(){
        Hamster hamster = new Hamster("MyHamster",15);
        System.out.println(hamster.getName());//just to print values
        System.out.println(hamster.getAge());//just to print values
        hamster.setfavouriteGame("Ball");//this can be sent on the constructor like above and then assert below
        System.out.println(hamster.getfavouriteGame());
        //System.out.println(hamster.getClass());

        //asserting tha values being sent, on the test method
        Assert.assertEquals(hamster.getName(), "MyHamster");
        Assert.assertEquals(hamster.getfavouriteGame(), "Ball");
        Assert.assertEquals(hamster.getAge(),15);


    }

        @Test
        public void Cat_Making_Noise(){
        Cat Reina = new Cat("Reinillo",2);
        Reina.makeNoise();
        Reina.feed("Raw fish");

    }
    @Test
    public void Cat_Grooming(){
        Cat Reina = new Cat("Rey",5);
        Reina.groom();
       // Reina.licksPaws(); //i can not call directly a private method from outside.

    }






}
