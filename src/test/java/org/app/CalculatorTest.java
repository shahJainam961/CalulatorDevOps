package org.app;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    Calculator cal = new Calculator();
    @Test
    public void add() {
        Assert.assertEquals(11 ,cal.add(5, 6));
        Assert.assertEquals(10 ,cal.add(5, 5));
    }
}