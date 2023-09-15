package com.poc;

import java.util.Arrays;

/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 14 2023
 */
public class LibraryOrganize {
    public void organizePile(int bookshelves, int slots, String[] pile){

        Arrays.sort(pile);

        int possibleSlots = bookshelves * slots;
        int maxStayInThePile = pile.length - possibleSlots;

        String[] stayInThePile =  new String[maxStayInThePile];
        String[][] finalBookshelve = new String[bookshelves][slots];

        int countSlot = 0;
        int countBookshelves = 0;
        int countStayInThePile = 0;

        for(int i=0;i < pile.length;i++) {

            if (i < possibleSlots) {

                if (countSlot == slots) {
                    countSlot = 0;
                    countBookshelves++;
                }
                finalBookshelve[countBookshelves][countSlot] = pile[i];
                countSlot++;

            } else {
                //add to the stay in the pile
                stayInThePile[countStayInThePile] = pile[i];
                countStayInThePile++;

            }
        }

        System.out.println(Arrays.toString(stayInThePile));

        System.out.println(Arrays.toString(finalBookshelve));


    }
}
