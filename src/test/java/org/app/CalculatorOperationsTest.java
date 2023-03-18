package org.app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorOperationsTest {

    CalculatorOperations calcOp = new CalculatorOperations();
    private final double tolerance =0.000000000001;

    @Test
    public void add() {
        Assert.assertEquals(10,calcOp.add(8,2),tolerance);
        Assert.assertEquals(10,calcOp.add(5,5),tolerance);
    }
    @Test
    public void addFalsePositive(){
        Assert.assertNotEquals(12,calcOp.add(2,5),tolerance);
        Assert.assertNotEquals(0,calcOp.add(4,4),tolerance);
    }

    @Test
    public void subtract() {
        Assert.assertEquals(0,calcOp.subtract(4,4),tolerance);
        Assert.assertEquals(0,calcOp.subtract(-4,-4),tolerance);
        Assert.assertEquals(-4,calcOp.subtract(4,8),tolerance);
    }
    @Test
    public void subtractFalsePositive(){
        Assert.assertNotEquals(10,calcOp.subtract(10,2),tolerance);
        Assert.assertNotEquals(14,calcOp.subtract(16,-2),tolerance);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(0,calcOp.multiply(0,1),tolerance);
        Assert.assertEquals(10,calcOp.multiply(5,2),tolerance);
    }

    @Test
    public void multiplyFalsePositive(){
        Assert.assertNotEquals(10,calcOp.multiply(10,0),tolerance);
        Assert.assertNotEquals(25,calcOp.multiply(5,1),tolerance);
    }

    @Test
    public void divide() {
        Assert.assertEquals(2,calcOp.divide(10,5),tolerance);
        Assert.assertEquals(Double.POSITIVE_INFINITY,calcOp.divide(1,0),tolerance);
        Assert.assertEquals(Double.NEGATIVE_INFINITY,calcOp.divide(-1,0),tolerance);
    }

    @Test
    public void divideFalsePositive(){
        Assert.assertNotEquals(3,calcOp.divide(6,3),tolerance);
        Assert.assertNotEquals(6,calcOp.divide(6,0),tolerance);
    }

    @Test
    public void squareRoot(){
        Assert.assertEquals(4.0,calcOp.squareRoot(16),tolerance);
        Assert.assertEquals(Math.sqrt(1564.564),calcOp.squareRoot(1564.564),tolerance);
        Assert.assertEquals(Double.NaN,calcOp.squareRoot(-2),tolerance);
    }

    @Test
    public void squareRootFalsePositive(){
        Assert.assertNotEquals(2,calcOp.squareRoot(5),tolerance);
        Assert.assertNotEquals(2,calcOp.squareRoot(-4),tolerance);
    }

    @Test
    public void fatorial(){
        Assert.assertEquals(120,calcOp.factorial(5),tolerance);
        Assert.assertEquals(1,calcOp.factorial(0),tolerance);
        Assert.assertEquals(1,calcOp.factorial(1),tolerance);
        Assert.assertEquals(Double.NaN,calcOp.factorial(-2),tolerance);
    }

    public void factorialFalsePositive(){
        Assert.assertNotEquals(24,calcOp.factorial(-4),tolerance);
        Assert.assertNotEquals(0,calcOp.factorial(0),tolerance);
    }

    @Test
    public void naturalLog(){
        Assert.assertEquals(1,calcOp.naturalLog(Math.exp(1)),tolerance);
        Assert.assertEquals(Math.log(23.56),calcOp.naturalLog(23.56),tolerance);
        Assert.assertEquals(Math.log(0),calcOp.naturalLog(0),tolerance);
        Assert.assertEquals(Double.NEGATIVE_INFINITY,calcOp.naturalLog(0),tolerance);
    }

    @Test
    public void naturalLogFalsePositive(){
        Assert.assertNotEquals(0,calcOp.naturalLog(0),tolerance);
    }

    @Test
    public void power(){
        Assert.assertEquals(16,calcOp.power(4,2),tolerance);
        Assert.assertEquals(1,calcOp.power(1,0),tolerance);
        Assert.assertEquals(Double.NaN,calcOp.power(-2,-0.99),tolerance);
        Assert.assertEquals(-0.125,calcOp.power(-2,-3),tolerance);
    }

    @Test
    public void powerFalsePositive(){
        Assert.assertNotEquals(-2,calcOp.power(-4,-0.5),tolerance);
    }


}