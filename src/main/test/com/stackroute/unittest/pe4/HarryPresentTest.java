package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class HarryPresentTest {
    HarryPresent harryPresent = new HarryPresent();

    @Test
    public void harry() {
        assertEquals(true, harryPresent.harry("This is Harry"));
        assertTrue(harryPresent.harry("Is Harry here"));
    }
    @Test
    public void harryFailure() {
        assertNotSame(false, harryPresent.harry("Is Harry here"));
        assertFalse(harryPresent.harry("helloharry"));
        assertFalse(harryPresent.harry("hello stackroute"));
        assertNotNull(harryPresent.harry("Is Harry here"));
    }
}