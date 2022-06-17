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
        public void Cat_Making_Noise(){ //this method also exists in Cat, Dog and Pet
        Cat Reina = new Cat("Reinillo",2);
        System.out.printf("Cats go: " + Reina.makeNoise());
            System.out.println(" ");
        Reina.feed("Raw fish");

    }
    @Test
    public void Cat_Grooming(){
        Cat Reina = new Cat("Rey",5);
        Reina.groom();
       // Reina.licksPaws(); //i can not call directly a private method from outside.

    }

    @Test //this method also exists in Cat, Dog and Pet can be overriden
    public void Dog_Making_Noise() {
        Dog Numoo = new Dog("Numoo", "Ball", 8);
        System.out.printf("Dogs go: " + Numoo.makeNoise());
    }

    @Test //testing the makeNoise method having the info from every pet. different
    public void Pets_Making_Noise(){
    Pet Catsy = new Cat("Catsy",5);
    Pet Hamsty = new Hamster("Hamsty",15);
    Pet Druby = new Fish("DipsyRed", 2);

        System.out.println("Cats go: " + Catsy.makeNoise());
        System.out.println("Hamsters go: " + Hamsty.makeNoise());
        System.out.println("Fish go: " + Druby.makeNoise());//what if the Fish class did not have a makeNoise() method? it will call the one on the Pet class

        //asserting that the values are correct, what i am expecting.
        Assert.assertEquals(Catsy.makeNoise(), "Meaaaaoowwww!!!");
        Assert.assertEquals(Hamsty.makeNoise(),"Squeakkkk!");
        Assert.assertEquals(Druby.makeNoise(), "Blooop, blooop!");//what if the Fish class did not have a makeNoise() method? it will call the one on the Pet class



    }


}
