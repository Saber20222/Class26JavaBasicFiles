package com.syntax.class26;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HW3 {

    // Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Ball");
        words.add("Practice");
        words.add("Field");

        for(int i=0; i < words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);

    }
}