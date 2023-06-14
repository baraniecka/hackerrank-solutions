package org.baraniecka.week3.exercise_2_subarray_division;

import java.util.List;

public class Subarray_division {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        int segment = 0;
        int sum = 0;

        for (int i = 0; i < s.size(); i++) {
            sum = s.subList(i, s.size()).stream().limit(m).reduce(Integer::sum).get();
            if (sum == d) {
                segment++;
            }
            if (i == s.size() - m) {
                break;
            }
        }
        return segment;
    }

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 4), 4, 1));
    }
}
