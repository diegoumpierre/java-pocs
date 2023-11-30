package com.poc;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The proposal for the class it is show the basic structure for a test class.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
class HammingTest {
    @Test
    public void testNoDistanceBetweenEmptyStrands() {
        assertThat(new Hamming("", "").getHammingDistance()).isEqualTo(0);
    }

    @Test
    public void testNoDistanceBetweenShortIdenticalStrands() {
        assertThat(new Hamming("A", "A").getHammingDistance()).isEqualTo(0);
    }

    @Test
    public void testCompleteDistanceInSingleLetterDifferentStrands() {
        assertThat(new Hamming("G", "T").getHammingDistance()).isEqualTo(1);
    }

    @Test
    public void testDistanceInLongIdenticalStrands() {
        assertThat(new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance()).isEqualTo(0);
    }

    @Test
    public void testDistanceInLongDifferentStrands() {
        assertThat(new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance()).isEqualTo(9);
    }

    @Test
    public void testValidatesFirstStrandNotLonger() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Hamming("AATG", "AAA"))
                .withMessage("strands must be of equal length");
    }

    @Test
    public void testValidatesSecondStrandNotLonger() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Hamming("ATA", "AGTG"))
                .withMessage("strands must be of equal length");
    }

    @Test
    public void testDisallowLeftEmptyStrand() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Hamming("", "G"))
                .withMessage("strands must be of equal length");
    }

    @Test
    public void testDisallowRightEmptyStrand() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Hamming("G", ""))
                .withMessage("strands must be of equal length");
    }ThenTwoShouldReturnFalse() {
        assertFalse(solution.basicMethod(1));
    }

}