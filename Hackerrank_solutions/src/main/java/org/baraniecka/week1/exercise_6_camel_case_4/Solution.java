package org.baraniecka.week1.exercise_6_camel_case_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] inputAsArray = line.split(";");

            String prefix = inputAsArray[0];
            String type = inputAsArray[1];
            String text = inputAsArray[2];

            if (prefix.equals("S")) {
                String[] textToSplit = splitByUpperCase(text);
                String result = getTextFromArray(textToSplit);
                System.out.println(result);
            }

            if (prefix.equals("C")) {

                String combined = combine(text);

                switch (type) {
                    case "C" -> combined = firstLetterToUppercase(combined);

                    case "M" -> combined = combined.concat("()");
                }

                System.out.println(combined);
            }
        }
    }

    private static String[] splitByUpperCase(String myString) {
        return myString.split("(?=\\p{Lu})");
    }

    private static String getTextFromArray(String[] myArray) {
        StringBuilder builder = new StringBuilder();

        for (String s : myArray) {
            builder.append(s).append(" ");
        }

        return builder
                .toString()
                .toLowerCase()
                .trim()
                .replace("()", "");
    }

    private static String combine(String textToCombine) {
        StringBuilder builder = new StringBuilder();

        String[] textToWordArray = textToCombine.split(" ");

        for (int i = 1; i < textToWordArray.length; i++) {

            textToWordArray[i] = firstLetterToUppercase(textToWordArray[i]);
        }

        for (String word : textToWordArray) {
            builder.append(word);
        }
        return builder.toString();
    }

    private static String firstLetterToUppercase(String lowercaseWord) {
        StringBuilder builder = new StringBuilder(lowercaseWord.substring(0, 1).toUpperCase());
        return builder.append(lowercaseWord.substring(1)).toString();
    }
}
