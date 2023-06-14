package org.baraniecka.week2.exercise_5_counting_sort_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] frequency = new Integer[100];
        Arrays.fill(frequency, 0);

        for (int i = 0; i < arr.size(); i++){
            int index = arr.get(i);
            frequency[index] += 1;
        }
        return Arrays.asList(frequency);
    }


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16,
                83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25,
                90, 59, 10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40,
                34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70,
                95, 33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33));

        List<Integer> result = countingSort(myList);
        System.out.println(result);

    }
}
