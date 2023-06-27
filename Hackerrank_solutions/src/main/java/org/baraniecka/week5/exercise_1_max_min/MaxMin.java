package org.baraniecka.week5.exercise_1_max_min;

import java.util.Collections;
import java.util.List;

public class MaxMin {

    /*
    You will be given a list of integers, arr, and a single integer k.
    You must create an array of length k from elements of arr such that
    its unfairness is minimized. Call that array arr'.
    Unfairness of an array is calculated as
        max(arr') - min(arr')
    Where:
        - max denotes the largest integer in arr'

        - min denotes the smallest integer in arr'
     */

    public static int maxMin(int k, List<Integer> arr) {

        Collections.sort(arr);

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - k + 1; i++) {
            int temp = arr.get(i + k - 1) - arr.get(i);

            if (temp < result) {
                result = temp;
            }
        }
        return result;
    }
}
