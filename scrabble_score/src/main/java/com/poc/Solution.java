package com.poc;

import java.util.HashMap;
import java.util.Map;

/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
public class Solution {
    private Map<String,Integer> letterValues = new HashMap<>();

    private void initLetterValues(){
        letterValues.put("AEIOULNRST",1);
        letterValues.put("DG",2);
        letterValues.put("BCMP",3);
        letterValues.put("FHVWY",4);
        letterValues.put("K",5);
        letterValues.put("JX",8);
        letterValues.put("QZ",10);

    }

}
