package org.baraniecka.week2.exercise_8_mars_exploration;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public static int marsExploration(String s) {
        // Write your code here
        AtomicInteger count = new AtomicInteger();
        int sosCount = s.length() / 3;
        String[] sosArray = new String[sosCount];

        for (int i = 0; i < sosCount; i++) {
            sosArray[i] = s.substring(0, 3);
            s = s.replaceFirst(s.substring(0, 3), "");
        }

        if (Arrays
                .stream(sosArray)
                .anyMatch(str -> !str.contains("SOS"))) {
            Arrays.stream(sosArray)
                    .filter(str -> !str.contains("SOS"))
                    .forEach(str -> {
                        if (str.charAt(0) != 'S') {
                            count.getAndIncrement();
                        }
                        if (str.charAt(2) != 'S') {
                            count.getAndIncrement();
                        }
                        if (str.charAt(1) != 'O') {
                            count.getAndIncrement();
                        }
                    });
        }
        return count.get();
    }

    public static void main(String[] args) {
        String sos = "SOSSOSSOS";

        int result = marsExploration(sos);
        System.out.println(result);
    }
}
