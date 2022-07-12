package com.syntax.class26;

import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {


        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drink = new ArrayList<>();
        drink.add("AppleJuice");
        drink.add("Lemonade");
        drink.add("Milk");
        drink.add("coffee");
        drink.add("doogh");

        for(int i=0; i<drink.size(); i++){
            if(drink.get(i).contains("a") || drink.get(i).contains("e")){
             drink.remove(i);
             drink.add(i, "water");
            }
        }
        System.out.println(drink);
    }
}