package com.serenitydojo.Assertions;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class addingTwoIntegers {


    @Test
    public void shouldAddtwoIntegersCorrectly(){

        int num1 = 2;
        int num2 = 3;

        int sum = num1+num2;

        Assert.assertEquals(5, sum);//JUnit assertion
        assertThat(sum).isEqualTo(5);//AssertJ assertion
    }

    @Test
    public void shouldValidateStrings(){

        String one = "red";
        String two = "Red";
        String three = "red, blue, green";

        assertThat(one).containsIgnoringCase(two);
        assertThat(three).contains("green");

        }

    @Test
    public void shouldValidateCollections(){

        List<String> colors = Arrays.asList("purple", "yellow", "brown","turquiose");

        //if you put it as an static import with the yellow bulb, the "Assertions.asserThat()" is shortened
        assertThat(colors).hasSize(4);
        assertThat(colors).contains("brown");
        assertThat(colors).containsExactly("purple", "yellow", "brown","turquiose");
        assertThat(colors).containsExactlyInAnyOrder("brown","turquiose", "purple", "yellow");

    }



}
