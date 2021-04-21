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
        float max = comparison.largest(4.1f, 5.6f, 2.3f);
    }
}