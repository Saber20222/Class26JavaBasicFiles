package com.syntax.class26;

import java.util.ArrayList;

public class HW5 {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
    */
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i < 500; i++){
            if(i%2==0){
                num.add(i);
            }
        }
        for( int i =0; i<num.size(); i++){
            if(num.get(i)%5==0){
                num.remove(i);
                i--;
            }
        }
        System.out.println(num);
    }
}