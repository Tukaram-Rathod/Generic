package com.comparison;


import org.junit.Assert;
import org.junit.Test;

public class CompareTest {

    @Test
    public void givenInteger_ShouldReturnsLargest(){
        Comparison comparison = new Comparison();
        int max = comparison.largest(41,56,23);
        Assert.assertEquals(56,max);
    }
}
