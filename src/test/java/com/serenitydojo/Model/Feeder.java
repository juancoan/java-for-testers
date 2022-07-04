package com.serenitydojo.Model;

public class Feeder {

    /*
    USING IF STATEMENT
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            // if (isPremium) { //this can be replaced with a ternary expression
            //  return "Salmon";
            return (isPremium) ? "Salmon" : "Tuna";
            //  }else{
            //     return "Tuna";
            // }
        } else if
        (animal.equals("Dog")) {
            return (isPremium) ? "Boiled Chicken" : "Doggie food";
        }
        return (isPremium) ? "Lettuce" : "Cabbage";
        }
    }

*/

  //USING SWITCH STATEMENT

    public FoodType feeds(AnimalType animal, boolean isPremium) {//receiving enum, returning FoodType
        switch (animal) {
            case CAT:
                return (isPremium) ? FoodType.Salmon : FoodType.Tuna;
            case DOG:
                return (isPremium) ? FoodType.Deluxe_Boiled_Chicken : FoodType.Doggie_Food;
            case HAMSTER:
                return (isPremium) ? FoodType.Lettuce : FoodType.Cabbage;
            default:
                return FoodType.UNKNOWN;
        }
    }
}









/*

if (animal.equals("Cat")) {
//these lines can be replaced with: (isPremium == true)? "Salmon" : "Tuna";
            if (isPremium) {
                return "Salmon";
            }else{
                return "Tuna";
            }
this can be replaced with the ternary expression:

if (isPremium) { //this can be replaced with: (isPremium == true)? "Salmon" : "Tuna";
   return (isPremium == true)? "Salmon" : "Tuna"; or also
   return (isPremium == true)? "Salmon" : "Tuna";

*/