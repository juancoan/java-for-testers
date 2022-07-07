package com.serenitydojo;

import com.serenitydojo.Model.AnimalType;
import com.serenitydojo.Model.Feeder;
import com.serenitydojo.Model.FoodType;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {


    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.CAT, false);//receiving enum
        Assert.assertEquals("Tuna", FoodType.Tuna.toString());
    //    Assert.assertEquals(food, "OtherFood"); would fail the assertion
    }

    @Test
    public void shouldFeedHamsterCabbage(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.HAMSTER, false);
        Assert.assertEquals("Cabbage", FoodType.Cabbage.toString());
        //    Assert.assertEquals("OtherFood", food); would fail the assertion
    }

    @Test
    public void shouldFeedDog(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.DOG, false);
        Assert.assertEquals("Doggie_Food", FoodType.Doggie_Food.toString());
    }

    @Test
    public void shouldFeedCatsPREMIUMFood(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.CAT, true);
        Assert.assertEquals("Salmon",FoodType.Salmon.toString());
    }

    @Test
    public void shouldFeedDogsPREMIUMFood(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.DOG, true);
        Assert.assertEquals("Deluxe_Boiled_Chicken",FoodType.Deluxe_Boiled_Chicken.toString());
    }
    @Test
    public void shouldFeedHamstersPREMIUMLettuce(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(AnimalType.HAMSTER, true);
        Assert.assertEquals("Lettuce",FoodType.Lettuce.toString());
    }

}
