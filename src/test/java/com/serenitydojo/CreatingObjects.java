package com.serenitydojo;

import org.junit.Test;
import org.junit.experimental.categories.Categories;

public class CreatingObjects {

    @Test
    public void Creating_A_Cat(){
        String name = "Reina";
        String favouriteFood = "Tuna";
        Integer age = 3;


        Cat Reina = new Cat("Reina");

        System.out.println(Reina.getName());
        Reina.setfavouriteFood("Tuna");
        System.out.println(Reina.getfavouriteFood());
        Reina.setAge(4);
        System.out.println(Reina.getAge());


        //I can also do the getName2 method right click and choose create property(for the get/set methods but it involves creating
        // new variables for the name, etc or on the constructor can pass the variables, but create and define the constructor on the
        // main Cat class)

        Cat Reina2 = new Cat("Reinilla");
        System.out.println(Reina2.getName());
        Reina2.setfavouriteFood("Fish");
        System.out.println(Reina2.getfavouriteFood());
        Reina2.setAge(10);
        System.out.println(Reina2.getAge());


        Pet hamster = new Pet("Juansito");
        System.out.println(hamster.getName());





    }

        @Test
        public void Cat_Making_Noise(){
        Cat Reina = new Cat("Reinillo");
        Reina.makeNoise();
        Reina.feed("Raw fish");

    }
    @Test
    public void Cat_Grooming(){
        Cat Reina = new Cat("Rey");
        Reina.groom();
       // Reina.licksPaws(); //i can not call directly a private method from outside.

    }






}
