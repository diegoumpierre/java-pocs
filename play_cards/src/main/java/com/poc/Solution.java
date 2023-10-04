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
    Map<String,Integer> cards = new HashMap<String,Integer>();

    private void setup(){
        cards.put("ace",11);
        cards.put("two",2);
        cards.put("three",3);
        cards.put("four",4);
        cards.put("five",5);
        cards.put("six",6);
        cards.put("seven",7);
        cards.put("eight",8);
        cards.put("nine",9);
        cards.put("ten",10);
        cards.put("jack",10);
        cards.put("queen",10);
        cards.put("king",10);
        cards.put("other",0);
    }

    public int parseCard(String card) {
        setup();
        return cards.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        setup();

        if ("ace".equals(card1) && "ace".equals(card2 ) ) return false;

        int sum = cards.get(card1) + cards.get(card2);
        if (sum > 20 ) return true;
        else return false;

    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        setup();

        if (isBlackjack && !(dealerScore == cards.get("ace")) || (dealerScore == cards.get("ten")) ) return "W";
        else return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 12 && handScore <= 16 &&  dealerScore < 7) return "S";
        else return "H";

    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {

        if ("ace".equals(card1) && "ace".equals(card2) && "ace".equals(dealerCard) ) return "P";

        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            if (isBlackjack(card1, card2) && parseCard(dealerCard) >= 10) return "S";
            return smallHand(handScore, dealerScore);
        }
    }
}
