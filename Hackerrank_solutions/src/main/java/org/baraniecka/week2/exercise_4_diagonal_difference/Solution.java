package org.baraniecka.week2.exercise_4_diagonal_difference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstSum = 0;
        int secondSum = 0;

        int listSize = arr.size();
        int innerListSize = arr.get(0).size();

        //firstSum
        for (int i = 0; i < listSize; i++) {

            firstSum += arr.get(i).get(i);

        }
        int j = innerListSize - 1;
        //secondSum
        for (int i = 0; i < listSize; i++){
            secondSum += arr.get(i).get(j);
            j--;
        }
        return Math.abs(firstSum - secondSum);
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> second = Arrays.asList(4, 5, 6, 5, 4);
        List<Integer> third = Arrays.asList(7, 8, 9, 8, 7);
        List<Integer> fourth = Arrays.asList(7, 8, 9, 8, 7);
        List<Integer> fifth = Arrays.asList(1, 2, 3, 2, 1);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(first);
        arr.add(second);
        arr.add(third);
        arr.add(fourth);
        arr.add(fifth);

        int result = diagonalDifference(arr);

        System.out.println(result);
    }
}
