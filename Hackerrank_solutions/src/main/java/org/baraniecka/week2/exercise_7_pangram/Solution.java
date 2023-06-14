package org.baraniecka.week2.exercise_7_pangram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static String pangrams(String s) {
        // Write your code here

        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 'a'; i <= 'z'; i++ ){
            alphabet.put((char) i, 0);
        }

        s = s.toLowerCase().replace(" ", "");

        for (char c : s.toCharArray()){
             alphabet.put(c, alphabet.get(c) + 1);
        }

        if(alphabet.containsValue(0)){
            return "not pangram";
        }
        else return "pangram";
    }

    public static void main(String[] args) {

        String sentence = "We promptly judged antique ivory buckles for the next prize";


        System.out.println(pangrams(sentence));

    }
}
