package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose = new StringTranspose();
    @Test
    public void transpose() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void tansposeFailure() {
        assertNotSame("a quick brown fox jumps over the lazy dog", stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));
        assertNotNull(stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));
    }
}