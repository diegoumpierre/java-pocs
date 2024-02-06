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

    @Test
    @Tag("task:1")
    @DisplayName("The static buy method returns a new remote controlled car instance")
    public void buy_new_car_returns_instance() {
        ElonsToyCar car = ElonsToyCar.buy();
        assertThat(car).isNotNull();
    }

}