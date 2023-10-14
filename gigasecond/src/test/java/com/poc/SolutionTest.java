package com.poc;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
    void ifTheParameterAreBiggerThenTwoShouldReturnTrue() throws ParseException {

        final String dateStr = "2015-01-24 22:00:00";
        final DateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss", Locale.ENGLISH);
        final Date inputDate = df.parse(dateStr);

        final String dateEnd = "2046-02-10 23:46:40";
        final Date expectDate = df.parse(dateEnd);
        Assert.assertEquals(expectDate,solution.calculateGigaSecond(inputDate));
    }
    @Test
    void ifTheParameterAreLessThenTwoShouldReturnFalse() {
        assertFalse(solution.basicMethod(1));
    }

}