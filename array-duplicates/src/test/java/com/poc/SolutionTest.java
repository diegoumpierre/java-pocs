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
    private Solution basicStructure;

    @BeforeEach
    void init(){
        basicStructure = new Solution();
    }

    @Test
    void scenario1() {
        int[] input ={1,2,3,1};
        assertTrue(basicStructure.verifyDuplicate(input));
    }

    @Test
    void scenario2() {
        int[] input ={1,2,3,4};
        assertFalse(basicStructure.verifyDuplicate(input));
    }

    @Test
    void scenario3() {
        int[] input ={1,1,1,3,3,4,3,2,4,2};
        assertTrue(basicStructure.verifyDuplicate(input));
    }



}