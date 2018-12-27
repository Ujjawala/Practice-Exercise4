package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] arg) {
        CharOccurrence charOccurrence = new CharOccurrence();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        System.out.println(charOccurrence.occurrence(string, ch));
    }
    public int occurrence(String string, char ch) {
        int originalLen = string.length();
//        String ch1 = Character.toString(ch);
        String newString = string.replaceAll(Character.toString(ch) , "");
        System.out.println(newString);
        return originalLen - newString.length();
    }
}
