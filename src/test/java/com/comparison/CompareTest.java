package com.comparison;

import org.junit.Assert;
import org.junit.Test;

public class CompareTest {


    // Refactor 1:Refactor all the 3 to One Generic Method and find the maximum
    @Test
    public void givenObjectGenericMethod_ShouldReturnsLargest() {
        Comparison comparison = new Comparison();
        String max = comparison.largest("Apple", "Peach","Banana");
        Assert.assertEquals("Peach",max);
    }
}