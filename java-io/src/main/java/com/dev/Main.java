package com.dev;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        getCharactersOfUniCodeValues();

        String leftArrow = "\u2190";
        String rightArrow = "\u2192";
        System.out.println("leftArrow = " + leftArrow);
        System.out.println("rightArrow = " + rightArrow);

        // Convert Unicode string to characters
        String unicodeString =
                "\u0627\u0644\u0633\u0644\u0627\u0645\u0020\u0639\u0644\u064a\u0643\u0645\u0020\u0648" +
                "\u0631\u062d\u0645\u0629\u0020\u0627\u0644\u0644\u0647\u0020\u0648\u0628\u0631\u0643" +
                "\u0627\u062a\u0647\u060c\u0020\u0623\u062a\u0645\u0646\u0649\u0020\u0623\u0646" +
                "\u0020\u062a\u0643\u0648\u0646\u0020\u0628\u062e\u064a\u0631\u002e\u0020\u0647" +
                "\u0630\u0647\u0020\u0631\u0633\u0627\u0644\u0629\u0020\u062a\u062c\u0631\u064a" +
                "\u0628\u064a\u0629\u0020\u0644\u062a\u0636\u0645\u064a\u0646\u0020\u0645\u0627" +
                "\u0626\u0629\u0020\u062d\u0631\u0641\u0020\u0639\u0631\u0628\u064a\u0020\u0641" +
                "\u064a\u0020\u0646\u0635\u0020\u0648\u0627\u062d\u062f\u002e ";
        System.out.println("Unicode String: " + unicodeString);

//         Convert characters back to Unicode string
        StringBuilder unicodeRepresentation = new StringBuilder();
        for (char c : unicodeString.toCharArray()) {
            unicodeRepresentation.append(String.format("\\u%04x", (int) c));
        }

        System.out.println("Unicode Representation: " + unicodeRepresentation.toString());
    }

    private static void getCharactersOfUniCodeValues() {
        int c = 0x600;
        for (int i = 0; i < 1000; i++){
            String s = Character.toString((char) c);
            System.out.printf("c = %s,  s = %s", c, s);
            System.out.println();
            c += i;
        }
    }
}