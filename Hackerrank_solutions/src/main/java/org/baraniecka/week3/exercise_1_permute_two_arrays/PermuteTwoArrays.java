package org.baraniecka.week3.exercise_1_permute_two_arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PermuteTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        List<Integer> B_usedIndexes = new ArrayList<>();
        A = A.stream().sorted().collect(Collectors.toList());
        B = B.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        A:
        for (int element : A) {
            for (int i = 0; i < B.size(); i++) {
                if (element + B.get(i) >= k) {
                    if (!B_usedIndexes.contains(i)) {
                        B_usedIndexes.add(i);
                        continue A;
                    }
                }
            }
        }

        if (B_usedIndexes.size() == B.size()){
            return "YES";
        }
        else return "NO";

    }

    public static void main(String[] args) {

        List<Integer> A = List.of(1, 5, 1, 4, 4, 2, 7, 1, 2, 2);
        List<Integer> B = List.of(8, 7, 1, 7, 7, 4, 4, 3, 6, 7);
        int k = 9;

        System.out.println(twoArrays(k, A, B));

    }

}
