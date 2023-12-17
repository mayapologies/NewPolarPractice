package com.mayapullara;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolarEquationTest {
    @Test
    public void testZero() {
        PolarEquation pe = new PolarEquation(1, 0, 0, 0);
        assertEquals(0, pe.getR(1), 0.000001);
    }

    @Test
    public void testOne() {
        PolarEquation pe = new PolarEquation(1, 1, 0, 0);
        assertEquals(1, pe.getR(1), 0.000001);
    }

    @Test
    public void testTwo() {
        PolarEquation pe = new PolarEquation(1, 0, 2, 0);
        assertEquals(1, pe.getR(Math.PI/6), 0.000001);
    }
}
