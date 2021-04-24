package com.comparison;
import com.comparison.Comparison;
import org.junit.Assert;
import org.junit.Test;

public class CompareTest {

    Comparison comparison = new Comparison();
    //UC4 :Extend the max method to take more then three parameters
    @Test
    public void givenThreeNumber_AndFirstNumber_ShouldReturnsLargest_True() {
        Integer [] integers = {14,5,3,6,8};
        Integer max = comparison.largest(integers);
        Assert.assertEquals(Integer.valueOf(14),max);
    }
}