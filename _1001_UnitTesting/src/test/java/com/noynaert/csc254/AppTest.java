package com.noynaert.csc254;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static final double DELTA = 0.00001;
    @Test
    public void square() {
        assertEquals(25, App.square(5));
        assertEquals(25, App.square(-5));
        assertEquals(0, App.square(0));
        assertEquals(1, App.square(1));
        assertEquals(1, App.square(-1));
        assertEquals(4, App.square(2));
        assertEquals(625, App.square(25));
        assertEquals(625, App.square(-25));
        //assertEquals(Integer.MAX_VALUE, App.square((int)Math.round(Math.sqrt(Integer.MAX_VALUE))));


    }

    @Test
    public void boo() {
    }

    @Test
    public void square_Double() {
        assertEquals(0.0, App.square(0.0),DELTA);
        assertEquals(25.0, App.square(5.0),DELTA);
        assertEquals(6.5025, App.square(2.55),DELTA);
    }

    @Test
    public void endsBeforeComma() {
        assertEquals("03", App.endsBeforeComma("03,"));
        assertEquals("03", App.endsBeforeComma("03"));
        assertEquals("", App.endsBeforeComma(""));
        assertEquals("", App.endsBeforeComma(",Hello"));
        assertEquals("03", App.endsBeforeComma("03,04,056,"));




    }
}
