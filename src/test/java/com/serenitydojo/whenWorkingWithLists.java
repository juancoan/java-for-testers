package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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







    }





