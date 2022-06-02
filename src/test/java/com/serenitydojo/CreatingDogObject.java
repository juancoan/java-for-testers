package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class CreatingDogObject {

    @Test
    public void Creating_A_Dog(){

        Dog Numa = new Dog("Numa", "Ball",8);
        Assert.assertEquals(Numa.getName(), "Numa");
        Assert.assertEquals(Numa.getfavouriteToy(), "Ball");
        Assert.assertEquals(Numa.getAge(),8);

    }

}
