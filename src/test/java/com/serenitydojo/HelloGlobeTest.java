package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HelloGlobeTest {

    @Test //JUnit test annotation to test the HelloGlobe class
    public void TestingHelloGlobe() {
        HelloGlobe greeting = new HelloGlobe();
        greeting.SayHello();
    }

    @Test
    public void listOfColors() {
        String[] color = {"red", "blue", "white"}; //this delaration when the array content is known, filled
        int[] ages = {5, 6, 7};

        String[] moreColors = new String[3];//this declaration when the array is not filled, known.
        moreColors[0] = "purple";
        moreColors[1] = "green";
        moreColors[2] = "pink";

        System.out.println("Added array of colors: 2nd color: " + moreColors[1]);

        for (int i = 0; i < 3; i++) {
            System.out.println("Color #" + (i + 1) + ": " + moreColors[i]);
        }


        List<String> myColorList = new ArrayList<>();//declaring an array list of strings, can have duplicates
        myColorList.add("Culo");
        myColorList.add("Pedo");
        myColorList.add("KK");
        myColorList.add("Mierda");

        //method 1 to run through it
        for (int i = 0; i < myColorList.size(); i++) {
            System.out.println("My item #" + (i + 1) + ": " + myColorList.get(i));// get() method is to access the index
        }

        //method 2 to run through it
        for (String someItem : myColorList) {
            System.out.println("My color: " + someItem);

        }

        Set<String> myColorSet = new HashSet<>();//declaring an array set of strings, can't have duplicates, order no important
        myColorSet.add("Culito");
        myColorSet.add("Pedito");
        myColorSet.add("KKita");
        myColorSet.add("Culito");//duplicate value, it will be removed when printed.

        for (String someItemOnSet : myColorSet) {
            System.out.println("My colorsito: " + someItemOnSet);

        }
    }
}
