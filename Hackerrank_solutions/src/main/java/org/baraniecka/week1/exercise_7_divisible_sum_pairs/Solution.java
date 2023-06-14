package org.baraniecka.week1.exercise_7_divisible_sum_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = ar.get(i) + ar.get(j);
                if (sum % k == 0) {
                    result++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 2, 6, 1, 2));

//        myList.add(1);
//        myList.add(4);
//        myList.add(2);
//        myList.add(1);
//        myList.add(5);
//        myList.add(8);

        System.out.println(divisibleSumPairs(myList.size(), 3, myList));
    }

}