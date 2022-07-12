package com.syntax.class26;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.ArrayList;

public class HW2 {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Toyota");

       System.out.println(cars);// first way
       for(int i=0; i<cars.size();i++){
           System.out.println(cars.get(i)); // second way
           // third way yet to be known
       }


    }
}