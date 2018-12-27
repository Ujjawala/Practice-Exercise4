package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordOccurrenceMatcherTest {
    WordOccurrenceMatcher wordOccurrenceMatcher = new WordOccurrenceMatcher();
    @Test
    public void occurrence() {
        int[] expected = {4, 10, 27};
        assertArrayEquals(expected, wordOccurrenceMatcher.occurrence("She sells seashells by the seashore", "se"));
    }
    @Test
    public void occurrenceFailure() {
        assertNotNull(wordOccurrenceMatcher.occurrence("She sells seashells by the seashore", "se"));
    }
}