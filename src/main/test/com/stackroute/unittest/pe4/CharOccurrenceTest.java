package com.stackroute.unittest.pe4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharOccurrenceTest {

    CharOccurrence charOccurrence = new CharOccurrence();

    @Test
    public void occurrence() {
        assertEquals(2, charOccurrence.occurrence("stackroute", 't'));
    }
    @Test
    public void occurrenceNotNull() {
        assertNotNull(charOccurrence.occurrence("domain", 'd'));
    }
}