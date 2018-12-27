package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedParaWordTest {
    SortedParaWord sortedParaWord = new SortedParaWord();
    @Test
    public void sortedWord() {
        String[] expected = {"enable", "generic", "java", "programmers", "specify", "to"};
        assertArrayEquals(expected, sortedParaWord.sortedWord("java generic enable programmers to specify"));
    }
    @Test
    public void sortedWordFailure() {
        String[] expected = {"enable", "generic", "java", "programmer", "specify", "to"};
        assertNotSame(expected, sortedParaWord.sortedWord("generic java enable programmers to specify"));
    }
}