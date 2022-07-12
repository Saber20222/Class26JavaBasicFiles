package com.syntax.class26;

import java.util.ArrayList;

public class HW1 {
   /* Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/


    public static void main(String[] args) {

        ArrayList<String> arrlist=new ArrayList<>();
        arrlist.add("Smith");
        arrlist.add("John");
        arrlist.add("Taylor");
        arrlist.add("Brown");
        arrlist.add("Shakira");
        System.out.println(arrlist.isEmpty());
        System.out.println(arrlist.contains("Shakira"));
        System.out.println(arrlist.size());
    }
}
