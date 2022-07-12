package com.serenitydojo;

import org.junit.Test;

import java.util.*;


public class whenWorkingWithLists {

    @Test
    public void creatingAsimpleList() {

        List myList = new ArrayList();
        myList.add("Some string value");
    }
    @Test
    public void creatingATypedList(){

        List<String> names = new ArrayList<>();//you can remove and add items. Not immutable. generics
        names.add("Juan");
        names.add("Joe");
        names.add("Someone");
        names.remove("Joe");

        for (int i = 0; i<2; i++) {
            System.out.println(names.get(i));
        }

        List<Integer> ages = Arrays.asList(1,2,3,4);//quicker way to create and add items to an array, IMMUTABLE LIST.

        for (int i = 0; i<4; i++) {
            System.out.println(ages.get(i));
        }
    }

        @Test
        public void creatingAmap(){

        Map<String, Integer> numberOfBallsByColor = new HashMap<>(); //Map<Key, Value> <String, Integer>, could also be new TreeMap<>();
        numberOfBallsByColor.put("red", 8);
        numberOfBallsByColor.put("blue", 5);
        numberOfBallsByColor.put("green", 26);

        Integer numberOfGreenBalls = numberOfBallsByColor.get("green");
            System.out.println("There are " + numberOfGreenBalls + " green balls.");
         }
        /*
         @Test
        public void creatingAmapMoreEficiently() {

            Map<String, Integer> numberOfBallsByColor = Map.of
                    ("blue", 3, "red", 18, "purple", 9); //Map<Key, Value> <String, Integer>, could also be new TreeMap<>();
            numberOfBallsByColor.put("orange", 8);
        } On the pm.xml file the maven compiler plugin has to be set to 9 for this to run

         numberOfBallsByColor.put(numbertoAdd);
         numberOfBallsByColor.replace(numbertoAdd);
         numberOfBallsByColor.getOrDefault(keyToGet, default value write 0);


        //Iterating over the map - 2 for methods
        System.out.println("Keys " + numberOfBallsByColor.keySet());

        for (String key : numberOfBallsByColor.keySet()){
        Integer numberOfBallsByColor = numberOfBallsByColor.get(key);
        System.out.println(key + " => " + numberOfBallsByColor);

        for (Map.entry<String,Integer> entry : numberOfBallsByColor.entrySet(){
        System.out.println(entry.getKey() + "->" + entry.getValue());


         }

        }



*/




    }





