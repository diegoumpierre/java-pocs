package com.poc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The proposal for the class it is show the basic structure for a test class.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
class SolutionTest {
    private Solution solution;
    @BeforeEach
    void init(){
        solution = new Solution();
    }

    @Test
    public void blackjackWithKingAceSecond() {
        assertTrue(solution.isBlackjack("king", "ace"));
    }

    @Test
    public void correctParsesEight() {
        assertEquals(solution.parseCard("eight"),8);
    }

    @Test
    public void correctParsesAce() {
        assertEquals(solution.parseCard("ace"),11);
    }

    @Test
    public void correctParsesTen() {
        assertEquals(solution.parseCard("ten"),10);
    }
}