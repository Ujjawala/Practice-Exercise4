package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurrenceMatcher {
    public static void main(String[] arg) {
        WordOccurrenceMatcher wordOccurrenceMatcher = new WordOccurrenceMatcher();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String pattern = scanner.nextLine();
        for (int i: wordOccurrenceMatcher.occurrence(string,pattern)) {
            System.out.println("Found at: " + i + " - " + (i+2));
        }
    }
    public int[] occurrence(String string, String pattern) {
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(string);
        int c = 0;
        while (matcher.find()) {
            c++;
//            System.out.println(matcher.start());
        }
//        System.out.println(c);
        int[] found = new int[c];
        int i = 0;
        matcher = pattern1.matcher(string);
        while (matcher.find()) {
            found[i] = matcher.start();
            i++;
        }
        return found;
    }
}
