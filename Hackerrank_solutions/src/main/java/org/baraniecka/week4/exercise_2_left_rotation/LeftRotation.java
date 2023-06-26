package org.baraniecka.week4.exercise_2_left_rotation;

import java.util.LinkedList;
import java.util.List;

public class LeftRotation {

    /*
    A left rotation operation on an array of size n shifts
     each of the array's elements 1 unit to the left.
     Given an integer, d, rotate the array that many steps left and return the result.
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> result = new LinkedList<>(arr);

        while (d > 0) {
            int temp = result.get(0);
            result.remove(0);
            result.add(temp);
            d--;
        }

        return result;
    }
}
