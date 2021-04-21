package com.comparison;


import org.junit.Assert;
import org.junit.Test;

public class CompareTest {

    @Test
    public void givenInteger_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        int max = comparison.largest(41, 56, 23);
        Assert.assertEquals(56, max);
    }

    @Test
    //TC1.1 Ensure the test data has Max Number in the First position
    public void givenInteger_AndFirstNumberIsMax_ShouldReturn_true() {
        Comparison comparison = new Comparison();
        int max = comparison.largest(555, 104, 180);
        Assert.assertEquals(555, max);
    }

    @Test
    //TC1.2 Ensure the test data has Max Number in the Second position
    public void givenInteger_AndSecondNumberIsMax_ShouldReturn_true() {
        Comparison comparison = new Comparison();
        int max = comparison.largest(55, 704, 180);
        Assert.assertEquals(704, max);
    }
}