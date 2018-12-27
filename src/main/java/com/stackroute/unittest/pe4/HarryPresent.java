package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class HarryPresent {
    public static void main(String[] arg) {
        HarryPresent harryPresent = new HarryPresent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is harry here ? " + harryPresent.harry(scanner.nextLine()));
    }
    public boolean harry(String str) {
        String string = str.toLowerCase();
        if (string.contains(" harry ")) {
            return true;
        } else if (string.contains("harry ")) {
            return true;
        } else if (string.contains(" harry")) {
            return true;
        } else {
            return false;
        }
    }
}
