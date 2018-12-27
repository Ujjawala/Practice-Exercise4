package com.stackroute.unittest.pe4;

import java.util.Arrays;
import java.util.Scanner;

public class SortedParaWord {
    public static void main(String[] arg) {
        String string = "LinkedHashMap is a Hash table and linked list implementation of the Map interface, " +
                "with predictable iteration order. This implementation differs from HashMap in that it maintains" +
                " a doubly-linked list running through all of its entries. This linked list defines the iteration" +
                " ordering, which is normally the order in which keys were inserted into the map";
        SortedParaWord sortedParaWord = new SortedParaWord();
        String[] sortedArray = sortedParaWord.sortedWord(string);
        for (String str: sortedArray) {
            System.out.println(str);
        }
    }
    public String[] sortedWord(String para) {
        String[] paraSplit = para.split(" ");
        Arrays.sort(paraSplit);
        return paraSplit;
    }
}
