package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] arg) {
        ReplaceChar replaceChar = new ReplaceChar();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(replaceChar.replaceChar(string));
    }
    public String replaceChar(String string) {
        return string.replaceAll("d", "f").replaceAll("l","t");
    }
}
