package com.poc;

import java.util.HashMap;
import java.util.Map;


/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 27 2023
 */
public class Solution {

    Map<String,Integer> colors = new HashMap<>();

    private void setup(){
        colors.put("black",0);
        colors.put("brown",1);
        colors.put("red",2);
        colors.put("orange",3);
        colors.put("yellow",4);
        colors.put("green",5);
        colors.put("blue",6);
        colors.put("violet",7);
        colors.put("grey",8);
        colors.put("white",9);
    }




   public int colorCode(String color) {
        setup();
        return colors.get(color);
    }
}
