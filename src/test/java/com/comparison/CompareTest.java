package com.comparison;

import org.junit.Assert;
import org.junit.Test;

public class CompareTest {

    // UC1-To Validate given three integer value gives maximum return true
    @Test
    public void givenInteger_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        int max = comparison.largest(41, 56, 23);
        Assert.assertEquals(56, max);
    }
    // UC2-To Validate given three float value gives maximum return true
    @Test
    public void givenFloat_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        Float max = comparison.largest(2.0f, 4.51f, 6.8f);
        Assert.assertEquals(6.8f,max);

    }
    // UC3-To Validate given three String value gives maximum return true
    @Test
    public void givenString_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        String max = comparison.largest("Ashish", "Rathod","Aarti");
        Assert.assertEquals("Rathod",max);
    }
}