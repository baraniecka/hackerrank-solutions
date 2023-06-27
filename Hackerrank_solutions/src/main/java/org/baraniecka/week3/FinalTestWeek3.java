package org.baraniecka.week3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FinalTestWeek3 {

    /*
    between two sets

    There will be two arrays of integers. Determine all integers
    that satisfy the following two conditions:

    1. The elements of the first array are all factors of the
    integer being considered

    2.The integer being considered is a factor of all elements
    of the second array
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {


        int maxFactor = b.stream().min(Integer::compareTo).orElse(0);

        List<Integer> c = IntStream.range(1, maxFactor+1)
                .boxed()
                .filter(i -> {

                    for (Integer integer : a) {
                        if (i % integer != 0) return false;
                    }

                    return true;
                }).toList();


        return (int) c.stream().filter(i -> {

            for (Integer integer : b) {
                if (integer % i != 0) return false;
            }

            return true;

        }).count();

    }


}
