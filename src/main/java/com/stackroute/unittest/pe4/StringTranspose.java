package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class StringTranspose {
    public static void main(String[] arg) {
        StringTranspose stringTranspose = new StringTranspose();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(stringTranspose.transpose(string));
    }
    public String transpose(String string) {
        String[] stringSplit = string.split(" ");
        String transposeString = "";
        for (String str: stringSplit) {
            StringBuilder stringBuilder = new StringBuilder(str);
            transposeString = transposeString + " " + stringBuilder.reverse();
        }
        return transposeString.trim();
    }
}
