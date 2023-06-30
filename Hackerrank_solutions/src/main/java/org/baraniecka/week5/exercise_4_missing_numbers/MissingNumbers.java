package org.baraniecka.week5.exercise_4_missing_numbers;

import java.util.*;

public class MissingNumbers {
/*
Given two arrays of integers, find which elements in
the second array are missing from the first array.
 */
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here

        Set<Integer> missing = new HashSet<>();

        for (int i = 0; i < brr.size(); i++){
            if (arr.contains(brr.get(i))){
                arr.remove(brr.get(i));
            }
            else{
                missing.add(brr.get(i));
            }
        }

        List<Integer> result = new ArrayList<>(missing);
        Collections.sort(result);

        return result;
    }
}
