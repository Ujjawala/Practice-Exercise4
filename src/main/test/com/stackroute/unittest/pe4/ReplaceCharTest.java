package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar replaceChar = new ReplaceChar();
    @Test
    public void replaceChar() {
        assertEquals("faity fry", replaceChar.replaceChar("daily dry"));
    }
    @Test
    public void setReplaceCharFailure() {
        assertNotSame("hello stackroute", replaceChar.replaceChar("hello stackroute"));
    }
}