package com.poc.basicstructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The proposal for the class it is show the basic structure for a test class.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
class BasicStructureTest {


    private BasicStructure basicStructure;

    @BeforeEach
    void init(){
        basicStructure = new BasicStructure();
    }

    @Test
    void ifTheParameterAreBiggerThenTwoShouldReturnTrue() {
        assertTrue(basicStructure.basicMethod(4));
    }


    @Test
    void ifTheParameterAreLessThenTwoShouldReturnFalse() {
        assertFalse(basicStructure.basicMethod(1));
    }



}